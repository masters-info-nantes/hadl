package org.alma.csa.metamodele.server.composants.security.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityAuthF extends ServiceFourni {
    public ServiceSecurityAuthF(SecurityAuthFourni securityAuthF){
        super.ajouterPortFournis(securityAuthF);
    }
}
