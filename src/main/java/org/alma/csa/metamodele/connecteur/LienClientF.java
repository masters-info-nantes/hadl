package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.client.SocketFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class LienClientF extends AttachementFourni {
    public LienClientF(SocketFourni socketF, RoleClientR roleClientR){
        super(socketF, roleClientR);
    }
}
