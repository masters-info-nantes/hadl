package org.alma.csa.hadl.liens;

import org.alma.csa.hadl.composant.interfaces.port.Port;
import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationFourni;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationRequis;

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
