package org.alma.csa.metamodele.server;

import org.alma.csa.hadl.composants.Configuration;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigF;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigR;
import org.alma.csa.metamodele.server.composants.connection.ConnectionManager;
import org.alma.csa.metamodele.server.composants.database.Database;
import org.alma.csa.metamodele.server.composants.security.SecurityManager;
import org.alma.csa.metamodele.server.connecteurs.ClearanceRequest;
import org.alma.csa.metamodele.server.connecteurs.SecurityQuery;
import org.alma.csa.metamodele.server.connecteurs.SqlQuery;

/**
 * Created by jeremy on 23/11/15.
 */
public class Serveur extends Configuration {
    public Serveur(ConnectionManager composantConnection, SecurityManager composantSecurity, Database composantDatabase,
                   ExternalSocketConfigF portExternalSocketF, ExternalSocketConfigR portExternalSocketR,
                   ClearanceRequest connecteurClearance, SecurityQuery connecteurSecurity, SqlQuery connecteurSql)
    {
        super.ajouterComposant(composantConnection);
        super.ajouterComposant(composantSecurity);
        super.ajouterComposant(composantDatabase);

        super.ajouterPortFourni(portExternalSocketF);
        super.ajouterPortRequis(portExternalSocketR);

        super.ajouterConnecteur(composantConnection, composantSecurity, connecteurClearance);
        super.ajouterConnecteur(composantSecurity, composantDatabase, connecteurSecurity);
        super.ajouterConnecteur(composantConnection, composantDatabase, connecteurSql);
    }
}
