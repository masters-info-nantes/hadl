package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingFourni extends Binding {

    public BindingFourni(PortConfigurationFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
    }

    public BindingFourni(PortComposantFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
    }

    public PortConfigurationFourni getPortConfiguration(){
        return (PortConfigurationFourni)super.getPortConfiguration();
    }
}
