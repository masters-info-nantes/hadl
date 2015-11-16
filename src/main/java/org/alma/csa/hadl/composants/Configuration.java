package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.hadl.liens.binding.BindingFourni;
import org.alma.csa.hadl.liens.binding.BindingRequis;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 11/11/15.
 */
public class Configuration extends ComposantAbstrait {

    private Set<ComposantAbstrait> composantsAbstraits;

    private Set<AttachementFourni> attachementFournis;
    private Set<AttachementRequis> attachementRequis;

    private Set<BindingFourni> bindingFournis;
    private Set<BindingRequis> bindingRequis;

    public Configuration(){
        this.composantsAbstraits = new HashSet<>();

        this.attachementFournis = new HashSet<>();
        this.attachementRequis = new HashSet<>();

        this.bindingFournis = new HashSet<>();
        this.bindingRequis = new HashSet<>();
    }
}
