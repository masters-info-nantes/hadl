package org.alma.csa.metamodele.server.connecteurs.security.connection;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienSecurityAuthF extends AttachementFourni {
    public LienSecurityAuthF(SecurityAuthFourni portSecurityAuthF, RoleSecurityAuthR roleSecurityAuthR){
        super(portSecurityAuthF, roleSecurityAuthR);
    }
}
