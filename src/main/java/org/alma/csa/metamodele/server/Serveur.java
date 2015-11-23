package org.alma.csa.metamodele.server;

import com.sun.javafx.tk.ScreenConfigurationAccessor;
import org.alma.csa.hadl.composants.Configuration;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigF;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigR;
import org.alma.csa.metamodele.server.composants.connection.ConnectionManager;
import org.alma.csa.metamodele.server.composants.database.Database;
import org.alma.csa.metamodele.server.composants.security.*;
import org.alma.csa.metamodele.server.composants.security.SecurityManager;

/**
 * Created by jeremy on 23/11/15.
 */
public class Serveur extends Configuration {
    public Serveur(ConnectionManager composantConnection, SecurityManager composantSecurity, Database composantDatabase,
                         ExternalSocketConfigF portExternalSocketF, ExternalSocketConfigR portExternalSocketR)
    {
        super.ajouterComposant(composantConnection);
        super.ajouterComposant(composantSecurity);
        super.ajouterComposant(composantDatabase);


    }
}
