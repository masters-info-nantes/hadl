package org.alma.csa.metamodele.server.connecteurs.security.database;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienCheckQueryF extends AttachementFourni {
    public LienCheckQueryF(CheckQueryFourni portCheckQueryF, RoleCheckQueryR roleCheckQueryR){
        super(portCheckQueryF, roleCheckQueryR);
    }
}
