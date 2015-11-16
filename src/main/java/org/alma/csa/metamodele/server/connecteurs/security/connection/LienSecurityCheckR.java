package org.alma.csa.metamodele.server.connecteurs.security.connection;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.SecurityCheckRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienSecurityCheckR extends AttachementRequis {
    public LienSecurityCheckR(SecurityCheckRequis portSecurityCheckR, RoleSecurityCheckF roleSecurityCheckF){
        super(portSecurityCheckR, roleSecurityCheckF);
    }
}
