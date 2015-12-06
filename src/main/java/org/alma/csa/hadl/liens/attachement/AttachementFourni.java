package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.Message;
import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.connecteurs.Role;
import org.alma.csa.hadl.connecteurs.RoleRequis;

import java.util.Observable;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementFourni extends Attachement {

    public AttachementFourni(PortComposantFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
        roleRequis.addObserver(this);
    }

    public AttachementFourni(PortConfigurationFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
        roleRequis.addObserver(this);
    }

    public void update(Observable obs, Object obj) {

        Message message = (Message) obj;

        System.out.println("[" + this.getClass().getName() + ". update]: " + message);
        super.port.transferer(message);
    }
}
