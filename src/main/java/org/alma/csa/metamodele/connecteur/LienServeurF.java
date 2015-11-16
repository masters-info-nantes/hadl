package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.metamodele.client.SocketFourni;

/**
 * Created by Eva on 15/11/16.
 */
public class LienServeurF extends AttachementFourni {
    public LienServeurF(SocketFourni socketF, RoleServeurR clientServeurR){
        super(socketF, clientServeurR);
    }
}
