package org.alma.csa.hadl.liens;

import org.alma.csa.hadl.composant.interfaces.port.Port;
import org.alma.csa.hadl.composant.interfaces.port.PortComposantFourni;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationFourni;
import org.alma.csa.hadl.connecteur.RoleRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementFourni extends Attachement {
    private RoleRequis roleRequis;
    private Port portFourni;

    public AttachementFourni(RoleRequis roleRequis, PortComposantFourni portFourni) {
        this.roleRequis = roleRequis;
        this.portFourni = portFourni;
    }

    public AttachementFourni(RoleRequis roleRequis, PortConfigurationFourni portFourni) {
        this.roleRequis = roleRequis;
        this.portFourni = portFourni;
    }
}
