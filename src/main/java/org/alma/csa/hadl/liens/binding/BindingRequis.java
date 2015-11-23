package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingRequis extends Binding {

    private PortConfigurationRequis portConfiguration;
    private Port portSource;

    public BindingRequis(PortConfigurationRequis portSource, PortConfigurationRequis portConfiguration){
        this.portSource = portSource;
        this.portConfiguration = portConfiguration;
    }

    public BindingRequis(PortComposantRequis portSource, PortConfigurationRequis portConfiguration){
        this.portSource = portSource;
        this.portConfiguration = portConfiguration;
    }

    public Port getPortSource(){
        return this.portSource;
    }

    public PortConfigurationRequis getPortConfiguration(){
        return this.portConfiguration;
    }
}
