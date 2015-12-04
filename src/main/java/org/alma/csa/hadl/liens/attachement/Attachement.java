package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.connecteurs.Role;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jeremy on 16/11/15.
 */
public abstract class Attachement implements Observer {
    protected Port port;
    protected Role role;

    public Attachement(Port port, Role role){
        this.port = port;
        this.role = role;

        this.port.addObserver(this);
        this.role.addObserver(this);
    }

    public void update(Observable obs, Object obj) {

    }
}
