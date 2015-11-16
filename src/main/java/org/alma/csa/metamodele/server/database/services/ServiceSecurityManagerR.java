package org.alma.csa.metamodele.server.database.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.database.ports.SecurityManagerRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSecurityManagerR extends ServiceRequis {
    public ServiceSecurityManagerR(SecurityManagerRequis securityManagerR){
        this.ajouterPortRequis(securityManagerR);
    }
}
