package org.alma.csa.hadl.connecteurs;

import org.alma.csa.hadl.composants.interfaces.Message;

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
        Message message = (Message) arg;

        if(o instanceof RoleFourni) {
            System.out.println("\n[Glue: " + this.getClass().getSimpleName() + ", Méthode:  update] message = " + message + "\n");
            this.roleRequis.transferer(message);
        }
    }
}
