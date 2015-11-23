package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingFourni extends Binding {

    private PortConfigurationFourni portConfiguration;
    private Port portSource;

    public BindingFourni(PortConfigurationFourni portSource, PortConfigurationFourni portConfiguration){
        this.portSource = portSource;
        this.portConfiguration = portConfiguration;
    }

    public BindingFourni(PortComposantFourni portSource, PortConfigurationFourni portConfiguration){
        this.portSource = portSource;
        this.portConfiguration = portConfiguration;
    }

    public Port getPortSource(){
        return this.portSource;
    }

    public PortConfigurationFourni getPortConfiguration(){
        return this.portConfiguration;
    }
}
