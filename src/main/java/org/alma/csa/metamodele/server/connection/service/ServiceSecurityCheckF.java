package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.port.PortComposantFourni;
import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceSecurityCheckF extends ServiceFourni {

    public ServiceSecurityCheckF (PortComposantFourni port){
        super.portsFournis.add(port);
    }
}
