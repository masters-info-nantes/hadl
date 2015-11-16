package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.port.PortConfigurationRequis;
import org.alma.csa.hadl.connecteur.RoleFourni;
import org.alma.csa.hadl.liens.AttachementRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class LienClientServeurR extends AttachementRequis {

    public LienClientServeurR(RoleFourni role, PortComposantRequis port){
        super(role,port);
    }

    public LienClientServeurR(RoleFourni role, PortConfigurationRequis port){
        super(role,port);
    }
}
