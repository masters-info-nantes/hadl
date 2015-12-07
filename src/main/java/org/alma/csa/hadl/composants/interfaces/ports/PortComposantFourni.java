package org.alma.csa.hadl.composants.interfaces.ports;

import org.alma.csa.hadl.composants.interfaces.Message;

/**
 * Created by jeremy on 11/11/15.
 */
public class PortComposantFourni extends PortComposant {
    @Override
    public void transferer(Message message){
        System.out.println("[PortComposantFourni: " + this.getClass().getSimpleName() + ", Méthode:  transferer] message = " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
