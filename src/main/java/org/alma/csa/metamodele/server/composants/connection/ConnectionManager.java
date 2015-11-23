package org.alma.csa.metamodele.server.composants.connection;

import org.alma.csa.hadl.composants.Composant;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceDBQueryF;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceDBQueryR;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceExternalSocketF;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceExternalSocketR;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceSecurityCheckF;
import org.alma.csa.metamodele.server.composants.connection.services.ServiceSecurityCheckR;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthF;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthR;

/**
 * Created by jeremy on 16/11/15.
 */
public class ConnectionManager extends Composant {
    public ConnectionManager(
            ServiceDBQueryF dbF, ServiceDBQueryR dbR,
            ServiceExternalSocketF socketF, ServiceExternalSocketR socketR,
            ServiceSecurityCheckF securityF, ServiceSecurityCheckR securityR)
    {
        super.ajouterServiceFourni(securityF);
        super.ajouterServiceRequis(securityR);

        super.ajouterServiceFourni(dbF);
        super.ajouterServiceRequis(dbR);

        super.ajouterServiceFourni(socketF);
        super.ajouterServiceRequis(socketR);
    }
}
