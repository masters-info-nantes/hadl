package org.alma.csa.metamodele.server;

import org.alma.csa.hadl.composants.Configuration;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigF;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigR;
import org.alma.csa.metamodele.server.composants.connection.ConnectionManager;
import org.alma.csa.metamodele.server.composants.database.Database;
import org.alma.csa.metamodele.server.composants.security.SecurityManager;
import org.alma.csa.metamodele.server.connecteurs.ClearanceRequest;
import org.alma.csa.metamodele.server.connecteurs.SecurityQuery;
import org.alma.csa.metamodele.server.connecteurs.SqlQuery;
import org.alma.csa.metamodele.server.connecteurs.connection.database.LienDbQueryF;
import org.alma.csa.metamodele.server.connecteurs.connection.database.LienQueryDatabaseR;
import org.alma.csa.metamodele.server.connecteurs.connection.security.LienSecurityAuthR;
import org.alma.csa.metamodele.server.connecteurs.connection.security.LienSecurityCheckF;
import org.alma.csa.metamodele.server.connecteurs.database.connection.LienDbQueryR;
import org.alma.csa.metamodele.server.connecteurs.database.connection.LienQueryDatabaseF;
import org.alma.csa.metamodele.server.connecteurs.database.security.LienCheckQueryR;
import org.alma.csa.metamodele.server.connecteurs.database.security.LienSecurityManagerF;
import org.alma.csa.metamodele.server.connecteurs.security.connection.LienSecurityAuthF;
import org.alma.csa.metamodele.server.connecteurs.security.connection.LienSecurityCheckR;
import org.alma.csa.metamodele.server.connecteurs.security.database.LienCheckQueryF;
import org.alma.csa.metamodele.server.connecteurs.security.database.LienSecurityManagerR;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 23/11/15.
 */
public class Serveur extends Configuration {
    public Serveur(ConnectionManager composantConnection, SecurityManager composantSecurity, Database composantDatabase,
                   ExternalSocketConfigF portExternalSocketF, ExternalSocketConfigR portExternalSocketR,

                   ClearanceRequest connecteurClearance, SecurityQuery connecteurSecurity, SqlQuery connecteurSql,

                   LienSecurityCheckR lienSecurityCheckR, LienSecurityAuthF lienSecurityAuthF,
                   LienSecurityCheckF lienSecurityCheckF, LienSecurityAuthR lienSecurityAuthR,

                   LienCheckQueryF lienCheckQueryF, LienSecurityManagerR lienSecurityManagerR,
                   LienCheckQueryR lienCheckQueryR, LienSecurityManagerF lienSecurityManagerF,

                   LienDbQueryF lienDbQueryF, LienQueryDatabaseR lienQueryDatabaseR,
                   LienDbQueryR lienDbQueryR, LienQueryDatabaseF lienQueryDatabaseF
                   )
    {
        super.ajouterComposant(composantConnection);
        super.ajouterComposant(composantSecurity);
        super.ajouterComposant(composantDatabase);

        super.ajouterPortFourni(portExternalSocketF);
        super.ajouterPortRequis(portExternalSocketR);

        Set<AttachementFourni> attachementsFournis = new HashSet<>();
        attachementsFournis.addAll(Arrays.asList(lienSecurityCheckF, lienSecurityAuthF));

        Set<AttachementRequis> attachementsRequis = new HashSet<>();
        attachementsRequis.addAll(Arrays.asList(lienSecurityCheckR, lienSecurityAuthR));

        super.ajouterConnecteur(
            composantConnection,
            composantSecurity, connecteurClearance,
            attachementsFournis, attachementsRequis
        );

        attachementsFournis.clear();
        attachementsFournis.addAll(Arrays.asList(lienCheckQueryF, lienSecurityManagerF));

        attachementsRequis.clear();
        attachementsRequis.addAll(Arrays.asList(lienCheckQueryR, lienSecurityManagerR));

        super.ajouterConnecteur(
            composantSecurity,
            composantDatabase, connecteurSecurity,
            attachementsFournis, attachementsRequis
        );

        attachementsFournis.clear();
        attachementsFournis.addAll(Arrays.asList(lienDbQueryF, lienQueryDatabaseF));

        attachementsRequis.clear();
        attachementsRequis.addAll(Arrays.asList(lienDbQueryR, lienQueryDatabaseR));

        super.ajouterConnecteur(
            composantConnection,
            composantDatabase, connecteurSql,
            attachementsFournis, attachementsRequis
        );
    }
}
