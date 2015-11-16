package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composant.Composant;
import org.alma.csa.hadl.composant.ComposantAbstrait;
import org.alma.csa.hadl.composant.interfaces.port.Port;

/**
 * Created by jeremy on 16/11/15.
 */
public class Client extends Composant {
    public Client(ServiceSocketF serviceSocket){
        super.ajouterServiceFourni(serviceSocket);
    }
}
