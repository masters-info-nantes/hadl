package org.alma.csa.hadl.connecteur;

import org.alma.csa.hadl.composant.ComposantAbstrait;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva on 15/11/16.
 */
public class ConnecteurComplexe extends Connecteur{
    private Set<ComposantAbstrait> composantsAbstraits;
    private Set<RoleFourni> roleFurnis;
    private Set<RoleRequis> roleRequis;

    public ConnecteurComplexe() {
        this.composantsAbstraits = new HashSet<>();
        this.roleFurnis = new HashSet<>();
        this.roleRequis = new HashSet<>();
    }
}
