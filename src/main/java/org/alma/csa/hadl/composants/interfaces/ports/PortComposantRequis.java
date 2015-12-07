package org.alma.csa.hadl.composants.interfaces.ports;

import org.alma.csa.hadl.composants.interfaces.Message;

/**
 * Created by jeremy on 11/11/15.
 */
public class PortComposantRequis extends PortComposant {
    @Override
    public void transferer(Message message){
        System.out.println("[PortComposantRequis: " + this.getClass().getSimpleName() + ", Méthode:  transferer] message = " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
