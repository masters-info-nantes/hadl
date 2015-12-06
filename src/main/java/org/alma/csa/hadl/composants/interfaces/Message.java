package org.alma.csa.hadl.composants.interfaces;

import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;

/**
 * Created by jeremy on 06/12/2015.
 */
public class Message {

    private Object message;
    private ServiceFourni service;

    public Message(Object message, ServiceFourni service){
        this.message = message;
        this.service = service;
    }

    public Object getMessage() {
        return message;
    }

    public ServiceFourni getService() {
        return service;
    }

    @Override
    public String toString(){
        return "[" + this.service.getClass().getName() + "] " + this.message;
    }
}
