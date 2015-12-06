package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;

/**
 * Created by jeremy on 16/11/15.
 */
public class ServiceSocketR extends ServiceRequis {
    public ServiceSocketR(SocketRequis portSocket){
        super.ajouterPortRequis(portSocket);
    }
}
