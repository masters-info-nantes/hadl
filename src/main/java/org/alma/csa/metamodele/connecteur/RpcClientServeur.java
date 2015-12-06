package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.connecteurs.ConnecteurSimple;

/**
 * Created by Eva on 15/11/16.
 */
public class RpcClientServeur extends ConnecteurSimple {
    public RpcClientServeur(GlueServeurClient glue){
        super.ajouterGlue(glue);
    }
}
