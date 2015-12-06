package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;

import java.util.Observable;

/**
 * Created by jeremy on 16/11/15.
 */
public class BindingRequis extends Binding {

    public BindingRequis(PortConfigurationRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
        portConfiguration.addObserver(this);
    }

    public BindingRequis(PortComposantRequis portSource, PortConfigurationRequis portConfiguration){
        super(portSource, portConfiguration);
        portSource.addObserver(this);
    }

    public void update(Observable obs, Object obj) {
        Message message = (Message) obj;

        System.out.println("[" + this.getClass().getName() + ". update]: " + message);
        super.getPortConfiguration().transferer(message);
    }

    public PortConfigurationRequis getPortConfiguration(){
        return (PortConfigurationRequis) super.getPortConfiguration();
    }
}
