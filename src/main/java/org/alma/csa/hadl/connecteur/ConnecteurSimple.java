package org.alma.csa.hadl.connecteur;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva on 15/11/16.
 */
public class ConnecteurSimple extends Connecteur {

    private Set<Glue> glues;

    public ConnecteurSimple() {
        this.glues = new HashSet<>();
    }
}
