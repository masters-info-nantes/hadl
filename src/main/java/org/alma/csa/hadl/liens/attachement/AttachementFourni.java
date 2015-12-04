package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.connecteurs.RoleRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementFourni extends Attachement {

    public AttachementFourni(PortComposantFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
    }

    public AttachementFourni(PortConfigurationFourni portFourni, RoleRequis roleRequis) {
        super(portFourni, roleRequis);
    }
}
