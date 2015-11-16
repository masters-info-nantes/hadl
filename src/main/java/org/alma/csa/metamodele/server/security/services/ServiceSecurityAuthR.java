package org.alma.csa.metamodele.server.security.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.security.ports.SecurityAuthRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityAuthR extends ServiceRequis {
    public ServiceSecurityAuthR(SecurityAuthRequis securityAuthR){
        super.ajouterPortRequis(securityAuthR);
    }
}
