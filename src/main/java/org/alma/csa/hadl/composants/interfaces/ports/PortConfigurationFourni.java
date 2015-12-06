package org.alma.csa.hadl.composants.interfaces.ports;

import org.alma.csa.hadl.composants.interfaces.Message;

/**
 * Created by jeremy on 11/11/15.
 */
public class PortConfigurationFourni extends PortConfiguration {
    @Override
    public void transferer(Message message){
        System.out.println("[" + this.getClass().getName() + ". transferer]: " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
