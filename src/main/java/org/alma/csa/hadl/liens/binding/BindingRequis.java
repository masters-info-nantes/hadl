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

    public BindingRequis(PortConfigurationRequis portConfiguration, PortConfigurationRequis portSource){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }

    public BindingRequis(PortConfigurationRequis portConfiguration, PortComposantRequis portSource){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }
}
