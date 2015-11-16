package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 11/11/15.
 */
public class Composant extends ComposantAbstrait {

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

        this.servicesRequis.add(service);
    }

    public void ajouterServiceFourni(ServiceFourni service){

        this.portsRequis.addAll(service.getPortsRequis());
        this.portsFournis.addAll(service.getPortsFournis());

        this.servicesFournis.add(service);
    }
}
