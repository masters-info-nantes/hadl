package org.alma.csa.metamodele.server.security.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.security.ports.CheckQueryFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceCheckQueryF extends ServiceFourni {
    public ServiceCheckQueryF(CheckQueryFourni checkQueryF){
        super.ajouterPortFournis(checkQueryF);
    }
}
