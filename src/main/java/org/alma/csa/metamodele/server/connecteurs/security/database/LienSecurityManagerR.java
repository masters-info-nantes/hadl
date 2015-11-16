package org.alma.csa.metamodele.server.connecteurs.security.database;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienSecurityManagerR extends AttachementRequis {
    public LienSecurityManagerR(SecurityManagerRequis portSecurityManagerR, RoleSecurityManangerF roleSecurityManangerF){
        super(portSecurityManagerR, roleSecurityManangerF);
    }
}
