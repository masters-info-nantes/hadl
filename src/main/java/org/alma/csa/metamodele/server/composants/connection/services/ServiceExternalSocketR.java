package org.alma.csa.metamodele.server.composants.connection.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceExternalSocketR extends ServiceRequis {
    public ServiceExternalSocketR(ExternalSocketRequis externalSocketR) {
        super.ajouterPortRequis(externalSocketR);
    }
}
