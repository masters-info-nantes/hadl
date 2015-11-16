package org.alma.csa.metamodele.server.connecteurs.database.security;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienCheckQueryR extends AttachementRequis {
    public LienCheckQueryR(CheckQueryRequis portCheckQueryR, RoleCheckQueryF roleCheckQueryF){
        super(portCheckQueryR, roleCheckQueryF);
    }
}
