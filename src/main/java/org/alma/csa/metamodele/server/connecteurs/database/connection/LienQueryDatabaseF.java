package org.alma.csa.metamodele.server.connecteurs.database.connection;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienQueryDatabaseF extends AttachementFourni {
    public LienQueryDatabaseF(QueryDatabaseFourni portQueryDatabaseF, RoleQueryDatabaseR roleQueryDatabaseR){
        super(portQueryDatabaseF, roleQueryDatabaseR);
    }
}
