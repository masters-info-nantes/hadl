package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingFourni extends Binding {

    private PortConfigurationFourni portConfiguration;
    private Port portSource;

    public BindingFourni(PortConfigurationFourni portConfiguration, PortConfigurationRequis portSource){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }

    public BindingFourni(PortConfigurationFourni portConfiguration, PortComposantRequis portSource){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }
}
