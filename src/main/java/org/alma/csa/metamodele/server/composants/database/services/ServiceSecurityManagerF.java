package org.alma.csa.metamodele.server.composants.database.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityManagerF extends ServiceFourni {
    public ServiceSecurityManagerF(SecurityManagerFourni securityManagerF){
        super.ajouterPortFournis(securityManagerF);
    }
}
