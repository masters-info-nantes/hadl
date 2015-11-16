package org.alma.csa.hadl.connecteur;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva on 15/11/16.
 */
public class Glue {
    private Set<RoleFourni> roleFurnis;
    private Set<RoleRequis> roleRequis;

    public Glue(){
        this.roleFurnis = new HashSet<>();
        this.roleRequis = new HashSet<>();
    }
}
