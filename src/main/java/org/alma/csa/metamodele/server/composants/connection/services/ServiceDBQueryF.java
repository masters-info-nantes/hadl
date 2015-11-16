package org.alma.csa.metamodele.server.composants.connection.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.DBQueryFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceDBQueryF extends ServiceFourni {
    public ServiceDBQueryF(DBQueryFourni dbQueryF) {
        super.ajouterPortFournis(dbQueryF);
    }
}
