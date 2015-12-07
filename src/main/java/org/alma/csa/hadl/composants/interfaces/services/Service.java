package org.alma.csa.hadl.composants.interfaces.services;

import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 11/11/15.
 */
public abstract class Service {

    private Set<PortComposantRequis> portsRequis;
    private Set<PortComposantFourni> portsFournis;

    public Service(){
        this.portsRequis = new HashSet<>();
        this.portsFournis = new HashSet<>();
    }

    public void ajouterPortRequis(PortComposantRequis port){
        this.portsRequis.add(port);
    }

    public void ajouterPortFournis(PortComposantFourni port){
        this.portsFournis.add(port);
    }

    public Object traitement(Object params){
        System.out.println("\n[Service: " + this.getClass().getSimpleName() + ", Méthode: traitement] message = " + params);
        return "";
    }

    public Set<PortComposantRequis> getPortsRequis(){
        return this.portsRequis;
    }

    public Set<PortComposantFourni> getPortsFournis(){
        return this.portsFournis;
    }
}
