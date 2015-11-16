package org.alma.csa.metamodele.server.database.services;

import org.alma.csa.hadl.composant.interfaces.service.ServiceRequis;
import org.alma.csa.metamodele.server.database.ports.QueryDatabaseRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceQueryDatabaseR extends ServiceRequis {
    public ServiceQueryDatabaseR(QueryDatabaseRequis queryDatabaseR){
        super.ajouterPortRequis(queryDatabaseR);
    }
}
