package org.alma.csa.hadl.connecteurs;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Eva on 15/11/16.
 */
public class Glue implements Observer {
    private RoleFourni roleFourni;
    private RoleRequis roleRequis;

    public Glue(RoleRequis roleRequis, RoleFourni roleFourni){
        this.roleFourni = roleFourni;
        this.roleRequis = roleRequis;

        this.roleFourni.addObserver(this);
        this.roleRequis.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Glue (" + this.getClass().getName() + ") notified to forward " + arg);

        this.roleFourni.tranferer(arg);
    }
}
