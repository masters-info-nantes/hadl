package org.alma.csa.hadl.connecteurs;

import org.alma.csa.hadl.composants.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva on 15/11/16.
 */
public class ConnecteurComplexe extends Connecteur{

    private Configuration configuration;

    private Set<RoleFourni> rolesFournis;
    private Set<RoleRequis> rolesRequis;

    public ConnecteurComplexe(Configuration configuration) {
        this.configuration = configuration;

        this.rolesFournis = new HashSet<>();
        this.rolesRequis = new HashSet<>();
    }
}
