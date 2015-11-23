package org.alma.csa.metamodele.server.composants.connection.services;

import org.alma.csa.hadl.composants.interfaces.services.ServiceRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.DBQueryRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.SecurityCheckRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class ServiceDBQueryR extends ServiceRequis{
    public ServiceDBQueryR(DBQueryRequis dbQueryR){
        super.ajouterPortRequis(dbQueryR);
    }
}