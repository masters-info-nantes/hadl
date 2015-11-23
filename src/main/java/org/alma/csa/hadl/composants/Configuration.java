package org.alma.csa.hadl.composants;

import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationFourni;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfigurationRequis;
import org.alma.csa.hadl.connecteurs.Connecteur;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.hadl.liens.binding.BindingRequis;
import org.alma.csa.hadl.liens.binding.BindingFourni;

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

    public boolean ajouterConnecteur(ComposantAbstrait composantA, ComposantAbstrait composantB,
                                     Connecteur connecteur, Set<AttachementFourni> attachementsF, Set<AttachementRequis> attachementsR)
    {

        if(attachementsF.size() != attachementsR.size()){
            return false;
        }

        if(!this.composantsAbstraits.containsAll(Arrays.asList(composantA, composantB))){
            return false;
        }

        Set<ComposantAbstrait> composants = new HashSet<>();
        composants.add(composantA);
        composants.add(composantB);

        this.connecteurs.put(connecteur, composants);

        this.attachementsFournis.addAll(attachementsF);
        this.attachementsRequis.addAll(attachementsR);

        return true;
    }

    public boolean ajouterBinding(BindingFourni binding){
        if(!this.portsConfigurationFournis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsFournis.add(binding);

        return true;
    }

    public boolean ajouterBinding(BindingRequis binding){
        if(!this.portsConfigurationRequis.contains(binding.getPortConfiguration())){
            return false;
        }

        this.bindingsRequis.add(binding);

        return true;
    }
}
