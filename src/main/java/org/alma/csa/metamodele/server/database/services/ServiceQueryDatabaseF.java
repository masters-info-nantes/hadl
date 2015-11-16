package org.alma.csa.metamodele.server.database.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;
import org.alma.csa.metamodele.server.database.ports.QueryDatabaseFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceQueryDatabaseF extends ServiceFourni {
    public ServiceQueryDatabaseF(QueryDatabaseFourni queryDatabaseF){
        super.ajouterPortFournis(queryDatabaseF);
    }
}
