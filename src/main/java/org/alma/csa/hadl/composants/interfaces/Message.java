package org.alma.csa.hadl.composants.interfaces;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;
import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;

/**
 * Created by jeremy on 06/12/2015.
 */
public class Message {

    public enum StatutMessage {
        SUIVRE, REPONSE
    }

    private Object message;

    private StatutMessage statut;

    private ServiceRequis serviceSource;
    private ServiceFourni serviceCible;

    public Message(Object message, ServiceRequis serviceSource, ServiceFourni serviceCible){
        this.message = message;
        this.serviceSource = serviceSource;
        this.serviceCible = serviceCible;

        this.statut = StatutMessage.SUIVRE;
    }

    public Object getMessage() {
        return message;
    }

    public ServiceFourni getServiceCible() {
        return serviceCible;
    }

    public ServiceRequis getServiceSource() {
        return serviceSource;
    }

    public StatutMessage getStatut() {
        return statut;
    }

    public void repondre(){
        this.statut = StatutMessage.REPONSE;
    }

    @Override
    public String toString(){
        return "[" + this.serviceCible.getClass().getName() + "] " + this.message;
    }
}
