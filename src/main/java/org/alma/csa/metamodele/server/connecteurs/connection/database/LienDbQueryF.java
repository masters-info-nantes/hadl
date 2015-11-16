package org.alma.csa.metamodele.server.connecteurs.connection.database;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.DBQueryFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienDbQueryF extends AttachementFourni {
    public LienDbQueryF(DBQueryFourni portDbQueryF, RoleDbQueryR roleDbQueryR){
        super(portDbQueryF, roleDbQueryR);
    }
}
