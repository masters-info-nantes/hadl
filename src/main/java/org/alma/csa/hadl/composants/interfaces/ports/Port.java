package org.alma.csa.hadl.composants.interfaces.ports;

import org.alma.csa.hadl.composants.interfaces.PointConnexion;

import java.util.Observable;

/**
 * Created by jeremy on 11/11/15.
 */
public abstract class Port extends Observable implements PointConnexion {
    public void transferer(Object message){

        System.out.println("Port (" + this.getClass().getName() + ") forwards " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
