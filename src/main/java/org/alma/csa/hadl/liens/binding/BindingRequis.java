package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingRequis extends Binding {

    public BindingRequis(PortConfigurationRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
    }

    public BindingRequis(PortComposantRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
    }

    public PortConfigurationRequis getPortConfiguration(){
        return (PortConfigurationRequis) super.getPortConfiguration();
    }
}
