package org.alma.csa.metamodele.server.connecteurs;

import org.alma.csa.hadl.connecteurs.ConnecteurSimple;
import org.alma.csa.metamodele.server.connecteurs.connection.security.GlueConnectionSecurity;
import org.alma.csa.metamodele.server.connecteurs.security.connection.GlueSecurityConnection;

/**
 * Created by jeremy on 16/11/15.
 */
public class ClearanceRequest extends ConnecteurSimple {
    public ClearanceRequest(GlueConnectionSecurity connectionSecurity, GlueSecurityConnection securityConnection){
        super.ajouterGlue(connectionSecurity);
        super.ajouterGlue(securityConnection);
    }
}
