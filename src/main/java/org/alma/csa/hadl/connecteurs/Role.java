package org.alma.csa.hadl.connecteurs;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.PointConnexion;

import java.util.Observable;

/**
 * Created by Eva on 15/11/16.
 */
public abstract class Role extends Observable implements PointConnexion {
    public void transferer(Message message){

        System.out.println("[" + this.getClass().getName() + ". transferer]: " + message);

        this.setChanged();
        this.notifyObservers(message);
    }
}
