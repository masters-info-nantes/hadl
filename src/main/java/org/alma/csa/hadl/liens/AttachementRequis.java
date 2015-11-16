package org.alma.csa.hadl.liens;

import org.alma.csa.hadl.composant.interfaces.port.Port;
import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationRequis;
import org.alma.csa.hadl.connecteur.RoleFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementRequis extends Attachement {
    private RoleFourni roleFourni;
    private Port portRequis;

    public AttachementRequis(RoleFourni roleFourni, PortComposantRequis portRequis) {
        this.roleFourni = roleFourni;
        this.portRequis = portRequis;
    }

    public AttachementRequis(RoleFourni roleFourni, PortConfigurationRequis portRequis) {
        this.roleFourni = roleFourni;
        this.portRequis = portRequis;
    }
}
