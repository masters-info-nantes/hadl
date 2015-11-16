package org.alma.csa.hadl.liens;

import org.alma.csa.hadl.composant.interfaces.port.Port;
import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationRequis;

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
