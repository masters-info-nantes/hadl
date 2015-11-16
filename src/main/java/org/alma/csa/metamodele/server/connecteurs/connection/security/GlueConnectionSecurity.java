package org.alma.csa.metamodele.server.connecteurs.connection.security;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueConnectionSecurity extends Glue {
    public GlueConnectionSecurity(RoleSecurityCheckR securityCheckR, RoleSecurityAuthF securityAuthF){
        super(securityCheckR, securityAuthF);
    }
}
