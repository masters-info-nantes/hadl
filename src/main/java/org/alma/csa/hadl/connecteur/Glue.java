package org.alma.csa.hadl.connecteur;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva on 15/11/16.
 */
public class Glue {
    private RoleFourni roleFourni;
    private RoleRequis roleRequis;

    public Glue(RoleFourni roleFourni, RoleRequis roleRequis){
        this.roleFourni = roleFourni;
        this.roleRequis = roleRequis;
    }
}
