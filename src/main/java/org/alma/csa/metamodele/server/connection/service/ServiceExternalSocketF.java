package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.connection.port.ExternalSocketFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceExternalSocketF extends ServiceFourni{
    public ServiceExternalSocketF(ExternalSocketFourni externalSocketF) {
        super.ajouterPortFournis(externalSocketF);
    }
}
