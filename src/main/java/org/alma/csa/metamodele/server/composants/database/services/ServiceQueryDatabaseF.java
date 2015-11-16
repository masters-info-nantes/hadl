package org.alma.csa.metamodele.server.composants.database.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceQueryDatabaseF extends ServiceFourni {
    public ServiceQueryDatabaseF(QueryDatabaseFourni queryDatabaseF){
        super.ajouterPortFournis(queryDatabaseF);
    }
}
