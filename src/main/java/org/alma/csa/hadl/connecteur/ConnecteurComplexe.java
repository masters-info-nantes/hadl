package org.alma.csa.hadl.connecteur;

import org.alma.csa.hadl.composant.ComposantAbstrait;
import org.alma.csa.hadl.composant.Configuration;

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
