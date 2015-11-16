package org.alma.csa.metamodele.server.connecteurs.database.connection;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.DBQueryRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class LienDbQueryR extends AttachementRequis {
    public LienDbQueryR(DBQueryRequis portDbQueryR, RoleDbQueryF roleDbQueryF){
        super(portDbQueryR, roleDbQueryF);
    }
}
