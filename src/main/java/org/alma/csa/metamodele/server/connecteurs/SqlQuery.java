package org.alma.csa.metamodele.server.connecteurs;

import org.alma.csa.hadl.connecteurs.ConnecteurSimple;
import org.alma.csa.metamodele.server.connecteurs.connection.database.GlueConnectionDatabase;
import org.alma.csa.metamodele.server.connecteurs.database.connection.GlueDatabaseConnection;

/**
 * Created by jeremy on 16/11/15.
 */
public class SqlQuery extends ConnecteurSimple {
    public SqlQuery(GlueConnectionDatabase connectionDatabase, GlueDatabaseConnection databaseConnection){
        super.ajouterGlue(connectionDatabase);
        super.ajouterGlue(databaseConnection);
    }
}
