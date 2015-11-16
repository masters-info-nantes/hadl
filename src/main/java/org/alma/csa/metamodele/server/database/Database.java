package org.alma.csa.metamodele.server.database;

import org.alma.csa.hadl.composant.Composant;
import org.alma.csa.metamodele.server.database.services.ServiceQueryDatabaseF;
import org.alma.csa.metamodele.server.database.services.ServiceQueryDatabaseR;
import org.alma.csa.metamodele.server.database.services.ServiceSecurityManagerF;
import org.alma.csa.metamodele.server.database.services.ServiceSecurityManagerR;

/**
 * Created by jeremy on 16/11/15.
 */
public class Database extends Composant {
    public Database(ServiceQueryDatabaseF queryDatabaseF, ServiceQueryDatabaseR queryDatabaseR,
                    ServiceSecurityManagerF securityManagerF, ServiceSecurityManagerR securityManagerR)
    {
        super.ajouterServiceFourni(queryDatabaseF);
        super.ajouterServiceRequis(queryDatabaseR);

        super.ajouterServiceFourni(securityManagerF);
        super.ajouterServiceRequis(securityManagerR);
    }
}
