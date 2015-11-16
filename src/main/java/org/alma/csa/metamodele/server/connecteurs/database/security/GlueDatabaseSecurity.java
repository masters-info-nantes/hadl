package org.alma.csa.metamodele.server.connecteurs.database.security;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueDatabaseSecurity extends Glue {
    public GlueDatabaseSecurity(RoleSecurityManagerR securityManagerR, RoleCheckQueryF checkQueryF){
        super(securityManagerR, checkQueryF);
    }
}
