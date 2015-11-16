package org.alma.csa.metamodele.server.security.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.security.ports.SecurityAuthFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityAuthF extends ServiceFourni {
    public ServiceSecurityAuthF(SecurityAuthFourni securityAuthF){
        super.ajouterPortFournis(securityAuthF);
    }
}
