package org.alma.csa.metamodele.server.database.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.database.ports.SecurityManagerFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityManagerF extends ServiceFourni {
    public ServiceSecurityManagerF(SecurityManagerFourni securityManagerF){
        super.ajouterPortFournis(securityManagerF);
    }
}
