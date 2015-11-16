package org.alma.csa.metamodele.server.connecteurs.connection.database;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueConnectionDatabase extends Glue {
    public GlueConnectionDatabase(RoleDbQueryR dbQueryR, RoleQueryDatabaseF queryDatabaseF){
        super(dbQueryR, queryDatabaseF);
    }
}
