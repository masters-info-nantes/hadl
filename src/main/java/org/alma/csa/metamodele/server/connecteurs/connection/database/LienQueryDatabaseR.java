package org.alma.csa.metamodele.server.connecteurs.connection.database;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienQueryDatabaseR extends AttachementRequis {
    public LienQueryDatabaseR(QueryDatabaseRequis portQueryDatabaseR, RoleQueryDatabaseF roleQueryDatabaseF){
        super(portQueryDatabaseR, roleQueryDatabaseF);
    }
}
