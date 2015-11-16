package org.alma.csa.metamodele.server.connecteurs;

import org.alma.csa.hadl.connecteurs.ConnecteurSimple;
import org.alma.csa.metamodele.server.connecteurs.database.security.GlueDatabaseSecurity;
import org.alma.csa.metamodele.server.connecteurs.security.database.GlueSecurityDatabase;

/**
 * Created by jeremy on 16/11/15.
 */
public class SecurityQuery extends ConnecteurSimple {
    public SecurityQuery(GlueSecurityDatabase securityDatabase, GlueDatabaseSecurity databaseSecurity){
        super.ajouterGlue(securityDatabase);
        super.ajouterGlue(databaseSecurity);
    }
}
