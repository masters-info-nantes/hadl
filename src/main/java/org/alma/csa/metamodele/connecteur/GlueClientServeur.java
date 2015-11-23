package org.alma.csa.metamodele.connecteur;

import org.alma.csa.hadl.connecteurs.Glue;

/**
 * Created by Eva on 15/11/16.
 */
public class GlueClientServeur extends Glue {
    public GlueClientServeur(RoleClientR clientF, RoleServeurF serveurR)
    {
        super(clientF, serveurR);
    }
}
