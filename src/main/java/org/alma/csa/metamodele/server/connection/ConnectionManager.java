package org.alma.csa.metamodele.server.connection;

import org.alma.csa.hadl.composant.Composant;
import org.alma.csa.metamodele.server.connection.service.ServiceDBQueryF;
import org.alma.csa.metamodele.server.connection.service.ServiceDBQueryR;
import org.alma.csa.metamodele.server.connection.service.ServiceExternalSocketF;
import org.alma.csa.metamodele.server.connection.service.ServiceExternalSocketR;
import org.alma.csa.metamodele.server.connection.service.ServiceSecurityCheckF;
import org.alma.csa.metamodele.server.connection.service.ServiceSecurityCheckR;

/**
 * Created by jeremy on 16/11/15.
 */
public class ConnectionManager extends Composant {
    public ConnectionManager(
            ServiceSecurityCheckF securityF, ServiceSecurityCheckR securityR,
            ServiceDBQueryF dbF, ServiceDBQueryR dbR,
            ServiceExternalSocketF socketF, ServiceExternalSocketR socketR)
    {
        super.ajouterServiceFourni(securityF);
        super.ajouterServiceRequis(securityR);

        super.ajouterServiceFourni(dbF);
        super.ajouterServiceRequis(dbR);

        super.ajouterServiceFourni(socketF);
        super.ajouterServiceRequis(socketR);
    }
}
