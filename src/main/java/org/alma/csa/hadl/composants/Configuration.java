package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
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

    private Set<PortConfigurationFourni> portsConfigurationFournis;
    private Set<PortConfigurationRequis> portsConfigurationRequis;

    private Set<AttachementFourni> attachementsFournis;
    private Set<AttachementRequis> attachementsRequis;

    private Set<BindingFourni> bindingsFournis;
    private Set<BindingRequis> bindingsRequis;

    public Configuration(){
        this.composantsAbstraits = new HashSet<>();

        this.portsConfigurationFournis = new HashSet<>();
        this.portsConfigurationRequis = new HashSet<>();

        this.attachementsFournis = new HashSet<>();
        this.attachementsRequis = new HashSet<>();

        this.bindingsFournis = new HashSet<>();
        this.bindingsRequis = new HashSet<>();
    }

    public void ajouterComposant(ComposantAbstrait composant){
        this.composantsAbstraits.add(composant);
    }

    public void ajouterPortFourni(PortConfigurationFourni portConfigurationF){
        this.portsConfigurationFournis.add(portConfigurationF);
    }

    public void ajouterPortRequis(PortConfigurationRequis portConfigurationR){
        this.portsConfigurationRequis.add(portConfigurationR);
    }
}
