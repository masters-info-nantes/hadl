package org.alma.csa.metamodele.server.composants.database.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceQueryDatabaseR extends ServiceRequis {
    public ServiceQueryDatabaseR(QueryDatabaseRequis queryDatabaseR){
        super.ajouterPortRequis(queryDatabaseR);
    }
}
