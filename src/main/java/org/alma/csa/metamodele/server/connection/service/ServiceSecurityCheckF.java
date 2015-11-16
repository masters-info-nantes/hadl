package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantFourni;
import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.connection.port.SecurityCheckFourni;
import org.alma.csa.metamodele.server.connection.port.SecurityCheckRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceSecurityCheckF extends ServiceFourni {
    public ServiceSecurityCheckF(SecurityCheckFourni securityCheckF){
        super.ajouterPortFournis(securityCheckF);
    }
}
