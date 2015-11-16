package org.alma.csa.metamodele.server.connecteurs.database.connection;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueDatabaseConnection extends Glue {
    public GlueDatabaseConnection(RoleQueryDatabaseR queryDatabaseR, RoleDbQueryF dbQueryF){
        super(queryDatabaseR, dbQueryF);
    }
}
