package org.alma.csa.hadl.liens.attachement;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortComposantRequis;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.connecteurs.RoleFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class AttachementRequis extends Attachement {

    protected Port portRequis;
    protected RoleFourni roleFourni;

    public AttachementRequis(PortComposantRequis portRequis, RoleFourni roleFourni) {
        this.portRequis = portRequis;
        this.roleFourni = roleFourni;
    }

    public AttachementRequis(PortConfigurationRequis portRequis, RoleFourni roleFourni) {
        this.portRequis = portRequis;
        this.roleFourni = roleFourni;
    }
}
