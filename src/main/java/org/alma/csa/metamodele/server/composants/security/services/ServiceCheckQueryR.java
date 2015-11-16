package org.alma.csa.metamodele.server.composants.security.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceCheckQueryR extends ServiceRequis {
    public ServiceCheckQueryR(CheckQueryRequis checkQueryR){
        this.ajouterPortRequis(checkQueryR);
    }
}
