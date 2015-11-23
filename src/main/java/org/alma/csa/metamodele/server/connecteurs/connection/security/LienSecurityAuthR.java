package org.alma.csa.metamodele.server.connecteurs.connection.security;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthRequis;
import org.alma.csa.metamodele.server.connecteurs.security.connection.RoleSecurityAuthR;

/**
 * Created by jeremy on 23/11/15.
 */
public class LienSecurityAuthR extends AttachementRequis {
    public LienSecurityAuthR(SecurityAuthRequis securityAuthR, RoleSecurityAuthF securityAuthF){
        super(securityAuthR, securityAuthF);
    }
}
