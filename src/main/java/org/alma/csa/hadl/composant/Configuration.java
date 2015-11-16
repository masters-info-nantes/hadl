package org.alma.csa.hadl.composant;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 11/11/15.
 */
public class Configuration extends ComposantAbstrait {

    private Set<ComposantAbstrait> composantsAbstraits;

    public Configuration(){
        this.composantsAbstraits = new HashSet<>();
    }
}
