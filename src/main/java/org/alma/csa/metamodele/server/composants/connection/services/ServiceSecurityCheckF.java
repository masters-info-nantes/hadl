package org.alma.csa.metamodele.server.composants.connection.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.SecurityCheckFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceSecurityCheckF extends ServiceFourni {
    public ServiceSecurityCheckF(SecurityCheckFourni securityCheckF){
        super.ajouterPortFournis(securityCheckF);
    }
}
