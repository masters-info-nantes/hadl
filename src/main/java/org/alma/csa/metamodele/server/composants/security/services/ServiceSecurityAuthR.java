package org.alma.csa.metamodele.server.composants.security.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityAuthR extends ServiceRequis {
    public ServiceSecurityAuthR(SecurityAuthRequis securityAuthR){
        super.ajouterPortRequis(securityAuthR);
    }
}
