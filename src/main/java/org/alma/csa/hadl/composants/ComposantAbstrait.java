package org.alma.csa.hadl.composants;

import java.util.Observable;
import org.alma.csa.hadl.composants.interfaces.services.ServiceFourni;

import java.util.List;

/**
 * Created by jeremy on 11/11/15.
 */
public abstract class ComposantAbstrait extends Observable {
    public abstract List<ServiceFourni> getServicesFournis();
}
