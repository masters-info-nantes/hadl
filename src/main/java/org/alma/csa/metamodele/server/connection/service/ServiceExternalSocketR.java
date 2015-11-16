package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.connection.port.ExternalSocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceExternalSocketR extends ServiceRequis {

    public ServiceExternalSocketR(ExternalSocketRequis port) {
        super.portsRequis.add(port);
    }
}
