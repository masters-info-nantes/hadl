package org.alma.csa.metamodele.server.connecteurs.database.security;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienSecurityManagerF extends AttachementFourni {
    public LienSecurityManagerF(SecurityManagerFourni portSecurityManagerF, RoleSecurityManagerR roleSecurityManagerR){
        super(portSecurityManagerF, roleSecurityManagerR);
    }
}
