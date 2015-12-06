package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

import java.util.Observable;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingFourni extends Binding {

    public BindingFourni(PortConfigurationFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
        portSource.addObserver(this);
    }

    public BindingFourni(PortComposantFourni portSource, PortConfigurationFourni portConfiguration){
        super(portSource, portConfiguration);
        portConfiguration.addObserver(this);
    }

    public void update(Observable obs, Object obj) {
        Message message = (Message) obj;

        System.out.println("[" + this.getClass().getName() + ". update]: " + message);
        super.getPortSource().transferer(message);
    }

    public PortConfigurationFourni getPortConfiguration(){
        return (PortConfigurationFourni)super.getPortConfiguration();
    }
}
