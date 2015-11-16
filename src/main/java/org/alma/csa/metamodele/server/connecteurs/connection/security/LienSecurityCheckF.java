package org.alma.csa.metamodele.server.connecteurs.connection.security;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.SecurityCheckFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienSecurityCheckF extends AttachementFourni {
    public LienSecurityCheckF(SecurityCheckFourni securityCheckF, RoleSecurityCheckR securityCheckR){
        super(securityCheckF, securityCheckR);
    }
}
