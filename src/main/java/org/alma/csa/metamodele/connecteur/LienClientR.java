package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.client.SocketRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class LienClientR extends AttachementRequis {
    public LienClientR(SocketRequis socketR, RoleClientF roleClientF){
        super(socketR, roleClientF);
    }
}
