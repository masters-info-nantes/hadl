package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by Eva on 15/11/16.
 */
public class GlueServeurClient extends Glue {
    public GlueServeurClient(RoleServeurR serveurR, RoleClientF clientF)
    {
        super(serveurR, clientF);
    }
}
