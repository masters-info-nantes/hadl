package org.alma.csa.metamodele.server.composants.security.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceCheckQueryF extends ServiceFourni {
    public ServiceCheckQueryF(CheckQueryFourni checkQueryF){
        super.ajouterPortFournis(checkQueryF);
    }
}
