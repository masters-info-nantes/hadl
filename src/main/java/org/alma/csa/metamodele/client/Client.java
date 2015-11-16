package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.composants.Composant;

/**
 * Created by jeremy on 16/11/15.
 */
public class Client extends Composant {
    public Client(ServiceSocketF serviceSocket){
        super.ajouterServiceFourni(serviceSocket);
    }
}
