package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantRequis;
import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.connection.port.SecurityCheckRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceSecurityCheckR extends ServiceRequis {
    public ServiceSecurityCheckR(SecurityCheckRequis securityCheckR){
        super.ajouterPortRequis(securityCheckR);
    }
}
