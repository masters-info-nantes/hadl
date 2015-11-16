package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class LienClientR extends AttachementRequis {
    public LienClientR(ExternalSocketRequis externalSocketR, RoleClientF clientServeurF){
        super(externalSocketR, clientServeurF);
    }
}
