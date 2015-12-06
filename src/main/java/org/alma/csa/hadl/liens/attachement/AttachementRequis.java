package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.connecteurs.RoleFourni;

import java.util.Observable;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementRequis extends Attachement {

    public AttachementRequis(PortComposantRequis portRequis, RoleFourni roleFourni) {
        super(portRequis, roleFourni);
        portRequis.addObserver(this);
    }

    public AttachementRequis(PortConfigurationRequis portRequis, RoleFourni roleFourni) {
        super(portRequis, roleFourni);
        portRequis.addObserver(this);
    }

    public void update(Observable obs, Object obj) {
        Message message = (Message) obj;

        System.out.println("[" + this.getClass().getName() + ". update]: " + message);
        super.role.transferer(message);
    }
}
