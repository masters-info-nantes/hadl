package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.connecteurs.Connecteur;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.hadl.liens.binding.BindingFourni;
import org.alma.csa.hadl.liens.binding.BindingRequis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    private Map<Connecteur, Set<ComposantAbstrait>> connecteurs;

    private Set<BindingFourni> bindingsFournis;
    private Set<BindingRequis> bindingsRequis;

    public Configuration(){
        this.composantsAbstraits = new HashSet<>();

        this.portsConfigurationFournis = new HashSet<>();
        this.portsConfigurationRequis = new HashSet<>();

        this.attachementsFournis = new HashSet<>();
        this.attachementsRequis = new HashSet<>();

        this.connecteurs = new HashMap<>();

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

    public boolean ajouterConnecteur(ComposantAbstrait composantA, ComposantAbstrait composantB, Connecteur connecteur){
        if(this.composantsAbstraits.containsAll(Arrays.asList(composantA, composantB))){
            Set<ComposantAbstrait> composants = new HashSet<>();
            composants.add(composantA);
            composants.add(composantB);

            this.connecteurs.put(connecteur, composants);

            return true;
        }

        return false;
    }
}
