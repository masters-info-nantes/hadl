package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSocketF extends ServiceFourni {
    public ServiceSocketF(SocketFourni portSocket){
        super.ajouterPortFournis(portSocket);
    }
}
