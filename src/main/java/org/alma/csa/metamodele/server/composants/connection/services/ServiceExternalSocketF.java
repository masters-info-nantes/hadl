package org.alma.csa.metamodele.server.composants.connection.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceExternalSocketF extends ServiceFourni{
    public ServiceExternalSocketF(ExternalSocketFourni externalSocketF) {
        super.ajouterPortFournis(externalSocketF);
    }
}
