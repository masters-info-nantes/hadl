package org.alma.csa.metamodele.server.security.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.security.ports.CheckQueryRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceCheckQueryR extends ServiceRequis {
    public ServiceCheckQueryR(CheckQueryRequis checkQueryR){
        this.ajouterPortRequis(checkQueryR);
    }
}
