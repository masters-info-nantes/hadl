package org.alma.csa.metamodele.server.connecteurs.security.connection;

import org.alma.csa.hadl.connecteurs.Glue;
import org.alma.csa.metamodele.server.connecteurs.connection.security.RoleSecurityAuthF;
import org.alma.csa.metamodele.server.connecteurs.connection.security.RoleSecurityCheckR;

/**
 * Created by jeremy on 16/11/15.
 */
public class GlueSecurityConnection extends Glue {
    public GlueSecurityConnection(RoleSecurityAuthR securityAuthR, RoleSecurityCheckF securityCheckF){
        super(securityAuthR, securityCheckF);
    }
}
