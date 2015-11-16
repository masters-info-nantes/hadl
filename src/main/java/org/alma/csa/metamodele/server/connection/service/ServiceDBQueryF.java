package org.alma.csa.metamodele.server.connection.service;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.connection.port.DBQueryFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceDBQueryF extends ServiceFourni {
    public ServiceDBQueryF(DBQueryFourni dbQueryF) {
        super.ajouterPortFournis(dbQueryF);
    }
}
