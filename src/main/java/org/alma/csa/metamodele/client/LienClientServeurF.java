package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantFourni;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationFourni;
import org.alma.csa.hadl.connecteur.RoleRequis;
import org.alma.csa.hadl.liens.AttachementFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class LienClientServeurF extends AttachementFourni {

    public LienClientServeurF(RoleRequis role, PortComposantFourni port){
        super(role,port);
    }

    public LienClientServeurF(RoleRequis role, PortConfigurationFourni port){
        super(role,port);
    }
}
