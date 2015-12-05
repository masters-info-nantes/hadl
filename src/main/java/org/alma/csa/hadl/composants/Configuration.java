package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.connecteurs.Connecteur;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.hadl.liens.binding.BindingRequis;
import org.alma.csa.hadl.liens.binding.BindingFourni;

import java.util.*;

/**
 * Created by jeremy on 11/11/15.
 */
public class Configuration extends ComposantAbstrait {

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

    public void appelerService(ComposantAbstrait source, ComposantAbstrait cible, ServiceFourni service, Object params){

        System.out.println("Configuration (" + this.getClass().getName() + ") call " + service.getClass().getName() + " service");

        Iterator it = this.connecteurs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();

            Map<String, Object> connecteurConfig = (Map<String, Object>) pair.getValue();
            Set<ComposantAbstrait> composants = (Set<ComposantAbstrait>) connecteurConfig.get(this.CONNECTEUR_COMPOSANTS_KEY);

            if(composants.containsAll(Arrays.asList(source, cible))){
                Set<AttachementFourni> attachementFournis = (Set<AttachementFourni>) connecteurConfig.get(this.CONNECTEUR_ATTACHEMENTS_F_KEY);
                AttachementFourni attachementFourni = (AttachementFourni) attachementFournis.toArray()[0];
                attachementFourni.getPort().transferer(params);
            }
        }
    }
}
