package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.connecteurs.RoleRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementFourni extends Attachement {

    protected Port portFourni;
    protected RoleRequis roleRequis;

    public AttachementFourni(PortComposantFourni portFourni, RoleRequis roleRequis) {
        this.portFourni = portFourni;
        this.roleRequis = roleRequis;
    }

    public AttachementFourni(PortConfigurationFourni portFourni, RoleRequis roleRequis) {
        this.portFourni = portFourni;
        this.roleRequis = roleRequis;
    }
}
