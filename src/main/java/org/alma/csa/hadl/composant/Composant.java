package org.alma.csa.hadl.composant;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantFourni;
import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;

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
}
