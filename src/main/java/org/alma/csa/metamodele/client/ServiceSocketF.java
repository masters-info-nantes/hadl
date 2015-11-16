package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composant.interfaces.service.Service;
import org.alma.csa.hadl.composant.interfaces.service.ServiceFourni;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSocketF extends ServiceFourni {
    public ServiceSocketF(SocketFourni portSocket){
        super.ajouterPortFournis(portSocket);
    }
}
