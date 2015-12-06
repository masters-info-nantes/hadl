package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.services.Service;
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
    }

    public Port getPort() {
        return port;
    }
}
