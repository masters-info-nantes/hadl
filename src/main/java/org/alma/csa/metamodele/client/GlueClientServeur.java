package org.alma.csa.metamodele.client;

import org.alma.csa.hadl.connecteur.Glue;
import org.alma.csa.hadl.connecteur.RoleFourni;
import org.alma.csa.hadl.connecteur.RoleRequis;

/**
 * Created by Eva on 15/11/16.
 */
public class GlueClientServeur extends Glue {

    public GlueClientServeur(RoleFourni roleF, RoleRequis roleR)
    {
        super(roleF, roleR);
    }
}
