package org.alma.csa.metamodele.server.composants.database.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityManagerR extends ServiceRequis {
    public ServiceSecurityManagerR(SecurityManagerRequis securityManagerR){
        this.ajouterPortRequis(securityManagerR);
    }
}
