package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.server.bindings.ExternalSocketConfigF;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class LienServeurF extends AttachementFourni {
    public LienServeurF(ExternalSocketConfigF portExternalSocketF, RoleServeurR roleServeurR){
        super(portExternalSocketF, roleServeurR);
    }
}
