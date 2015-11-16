package org.alma.csa.hadl.connecteurs;

/**
 * Created by Eva on 15/11/16.
 */
public class Glue {
    private RoleFourni roleFourni;
    private RoleRequis roleRequis;

    public Glue(RoleRequis roleRequis, RoleFourni roleFourni){
        this.roleFourni = roleFourni;
        this.roleRequis = roleRequis;
    }
}
