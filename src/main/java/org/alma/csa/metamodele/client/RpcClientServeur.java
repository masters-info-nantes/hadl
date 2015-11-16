package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.connecteur.ConnecteurSimple;

/**
 * Created by Eva on 15/11/16.
 */
public class RpcClientServeur extends ConnecteurSimple {
    public RpcClientServeur(GlueClientServeur glue){
        super.glues.add(glue);
    }
}
