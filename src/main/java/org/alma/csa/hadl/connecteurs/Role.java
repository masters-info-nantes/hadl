package org.alma.csa.hadl.connecteurs;

import org.alma.csa.hadl.composants.interfaces.PointConnexion;

import java.util.Observable;

/**
 * Created by Eva on 15/11/16.
 */
public abstract class Role extends Observable implements PointConnexion {
    public void tranferer(Object message){

        System.out.println("Role (" + this.getClass().getName() + ") forwards " + message);

        // this.setChanged();
       // this.notifyObservers(message);
    }
}
