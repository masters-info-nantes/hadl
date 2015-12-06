package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.hadl.connecteurs.Connecteur;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.hadl.liens.binding.BindingRequis;
import org.alma.csa.hadl.liens.binding.BindingFourni;

import java.util.*;

/**
 * Created by jeremy on 11/11/15.
 */
public class Configuration extends ComposantAbstrait implements Observer {

    private static final String CONNECTEUR_COMPOSANTS_KEY = "composants";
    private static final String CONNECTEUR_ATTACHEMENTS_F_KEY = "attachementsF";
    private static final String CONNECTEUR_ATTACHEMENTS_R_KEY = "attachementsR";

    private Set<ComposantAbstrait> composantsAbstraits;

    private Set<PortConfigurationFourni> portsConfigurationFournis;
    private Set<PortConfigurationRequis> portsConfigurationRequis;

    private Map<Connecteur, Map<String, Object>> connecteurs;

    private Set<BindingFourni> bindingsFournis;
    private Set<BindingRequis> bindingsRequis;

    public Configuration(){
        this.composantsAbstraits = new HashSet<>();

        this.portsConfigurationFournis = new HashSet<>();
        this.portsConfigurationRequis = new HashSet<>();

        this.connecteurs = new HashMap<>();

        this.bindingsFournis = new HashSet<>();
        this.bindingsRequis = new HashSet<>();
    }

    public void ajouterComposant(ComposantAbstrait composant){
        this.composantsAbstraits.add(composant);
        composant.addObserver(this);
    }

    public void ajouterPortFourni(PortConfigurationFourni portConfigurationF){
        this.portsConfigurationFournis.add(portConfigurationF);
    }

    public void ajouterPortRequis(PortConfigurationRequis portConfigurationR){
        this.portsConfigurationRequis.add(portConfigurationR);
    }

    public boolean ajouterConnecteur(ComposantAbstrait composantA, ComposantAbstrait composantB,
                                     Connecteur connecteur, Set<AttachementFourni> attachementsF, Set<AttachementRequis> attachementsR)
    {

        if(attachementsF.size() != attachementsR.size()){
            return false;
        }

        if(!this.composantsAbstraits.containsAll(Arrays.asList(composantA, composantB))){
            return false;
        }

        Set<ComposantAbstrait> composants = new HashSet<>();
        composants.add(composantA);
        composants.add(composantB);

        Map<String, Object> connecteurConfig = new HashMap<>();
        connecteurConfig.put(this.CONNECTEUR_COMPOSANTS_KEY, composants);
        connecteurConfig.put(this.CONNECTEUR_ATTACHEMENTS_F_KEY, attachementsF);
        connecteurConfig.put(this.CONNECTEUR_ATTACHEMENTS_R_KEY, attachementsR);

        this.connecteurs.put(connecteur, connecteurConfig);

        return true;
    }

    public boolean ajouterBinding(BindingFourni binding){
        if(!this.portsConfigurationFournis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsFournis.add(binding);

        return true;
    }

    public boolean ajouterBinding(BindingRequis binding){
        if(!this.portsConfigurationRequis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsRequis.add(binding);

        return true;
    }

    public List<ServiceFourni> getServicesFournis(){
        List<ServiceFourni> servicesFournis = new ArrayList<>();

        for(ComposantAbstrait composant : this.composantsAbstraits){
            servicesFournis.addAll(composant.getServicesFournis());
        }

        return servicesFournis;
    }

    public void appelerService(ComposantAbstrait source, Message message){
        Port port = (Port) message.getServiceSource().getPortsRequis().toArray()[0];
        port.transferer(message);
    }
    public void appelerService(ComposantAbstrait source, ServiceRequis serviceRequis, ServiceFourni serviceFourni, Object args){

        System.out.println("[" + this.getClass().getName() + ". appelerService]: " + serviceRequis.getClass().getName());

        Message message = new Message(args, serviceRequis, serviceFourni);
        appelerService(source, message);
    }

    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;

        System.out.println("[" + this.getClass().getName() + ". update]: " + message);

        if(message.getStatut() == Message.StatutMessage.REPONSE){

        }
        else if(message.getStatut() == Message.StatutMessage.SUIVRE){
            Composant composant = (Composant) o;
            ComposantAbstrait composantCible = null;

            // Composant du service ciblé
            for (ComposantAbstrait composantAbstrait : this.composantsAbstraits) {
                if (composantAbstrait.getServicesFournis().contains(message.getServiceCible())) {
                    composantCible = composantAbstrait;
                }
            }

            ServiceRequis serviceReq = null;
            Iterator it = this.connecteurs.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();

                Map<String, Object> composantProperties = (Map<String, Object>) pair.getValue();
                Set<ComposantAbstrait> composantsAb = (Set<ComposantAbstrait>) composantProperties.get(CONNECTEUR_COMPOSANTS_KEY);

                if (composantsAb.containsAll(Arrays.asList(composant, composantCible))) {
                    Set<AttachementRequis> attachementRequisT = (Set<AttachementRequis>) composantProperties.get(CONNECTEUR_ATTACHEMENTS_R_KEY);
                    AttachementRequis attachementR = (AttachementRequis) attachementRequisT.toArray()[0];

                    serviceReq = composant.chercherServiceRequis(attachementR.getPort());
                }
            }

            Message response = new Message(message.getMessage(), serviceReq, message.getServiceCible());
            response.repondre();

            this.appelerService(composant, response);
        }
    }
}
