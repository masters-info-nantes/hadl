package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;

import java.util.*;

/**
 * Created by jeremy on 11/11/15.
 */
public class Composant extends ComposantAbstrait implements Observer {

    private Set<PortComposantRequis> portsRequis;
    private Set<PortComposantFourni> portsFournis;

    private Set<ServiceRequis> servicesRequis;
    private Set<ServiceFourni> servicesFournis;

    public Composant(){
        this.portsRequis = new HashSet<>();
        this.portsFournis = new HashSet<>();

        this.servicesRequis = new HashSet<>();
        this.servicesFournis = new HashSet<>();
    }

    public void ajouterServiceRequis(ServiceRequis service){

        this.portsRequis.addAll(service.getPortsRequis());
        this.portsFournis.addAll(service.getPortsFournis());

        for(PortComposantFourni port: service.getPortsFournis()){
            port.addObserver(this);
        }

        this.servicesRequis.add(service);
    }

    public void ajouterServiceFourni(ServiceFourni service){

        this.portsRequis.addAll(service.getPortsRequis());
        this.portsFournis.addAll(service.getPortsFournis());

        for(PortComposantFourni port: service.getPortsFournis()){
            port.addObserver(this);
        }

        this.servicesFournis.add(service);
    }

    public List<ServiceFourni> getServicesFournis(){
        return new ArrayList<>(this.servicesFournis);
    }

    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;

        System.out.println("[Composant: " + this.getClass().getSimpleName() + ", Méthode:  update] message = " + message);

        if(message.getStatut() != Message.StatutMessage.REPONSE) {
            if (this.servicesFournis.contains(message.getServiceCible())) {
                message.setMessage(message.getServiceCible().traitement(message.getMessage()));
                message.repondre();

                System.out.println("--> Appel reçu <--\n");
            }

            this.setChanged();
            this.notifyObservers(message);
        }
        else {
            message.getServiceCible().traitement(message.getMessage());
            System.out.println("--> Réponse reçue <--\n");
        }
    }

    public boolean contientPort(Port port){
        return this.portsFournis.contains(port) || this.portsRequis.contains(port);
    }

    public ServiceRequis chercherServiceRequis(Port port) {
        for(ServiceRequis service : this.servicesRequis){
            if(service.getPortsRequis().contains(port)){
                return service;
            }
        }
        return null;
    }

    public ServiceFourni chercherServiceFourni(Port port) {
        for(ServiceFourni service : this.servicesFournis){
            if(service.getPortsFournis().contains(port)){
                return service;
            }
        }
        return null;
    }
}
