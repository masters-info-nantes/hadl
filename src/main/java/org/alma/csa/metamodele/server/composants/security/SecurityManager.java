package org.alma.csa.metamodele.server.composants.security;

import org.alma.csa.hadl.composants.Composant;
import org.alma.csa.metamodele.server.composants.security.services.ServiceCheckQueryF;
import org.alma.csa.metamodele.server.composants.security.services.ServiceCheckQueryR;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthF;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthR;

/**
 * Created by jeremy on 16/11/15.
 */
public class SecurityManager extends Composant {
    public SecurityManager(ServiceCheckQueryF checkQueryF, ServiceCheckQueryR checkQueryR,
                           ServiceSecurityAuthF securityAuthF, ServiceSecurityAuthR securityAuthR)
    {
        super.ajouterServiceFourni(securityAuthF);
        super.ajouterServiceRequis(securityAuthR);

        super.ajouterServiceFourni(checkQueryF);
        super.ajouterServiceRequis(checkQueryR);
    }
}
