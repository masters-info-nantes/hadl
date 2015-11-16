package org.alma.csa.metamodele.server.connecteurs.security.database;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueSecurityDatabase extends Glue {
    public GlueSecurityDatabase(RoleCheckQueryR checkQueryR, RoleSecurityManangerF securityManangerF){
        super(checkQueryR, securityManangerF);
    }
}
