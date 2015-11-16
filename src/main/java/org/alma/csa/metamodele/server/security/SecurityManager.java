package org.alma.csa.metamodele.server.security;

import org.alma.csa.hadl.composant.Composant;
import org.alma.csa.metamodele.server.security.services.ServiceCheckQueryF;
import org.alma.csa.metamodele.server.security.services.ServiceCheckQueryR;
import org.alma.csa.metamodele.server.security.services.ServiceSecurityAuthF;
import org.alma.csa.metamodele.server.security.services.ServiceSecurityAuthR;

/**
 * Created by jeremy on 16/11/15.
 */
public class SecurityManager extends Composant {
    public SecurityManager(ServiceSecurityAuthF securityAuthF, ServiceSecurityAuthR securityAuthR,
                           ServiceCheckQueryF checkQueryF, ServiceCheckQueryR checkQueryR)
    {
        super.ajouterServiceFourni(securityAuthF);
        super.ajouterServiceRequis(securityAuthR);

        super.ajouterServiceFourni(checkQueryF);
        super.ajouterServiceRequis(checkQueryR);
    }
}
