package org.alma.csa.hadl.liens.binding;

import org.alma.csa.hadl.composants.interfaces.ports.Port;
import org.alma.csa.hadl.composants.interfaces.ports.PortConfiguration;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jeremy on 16/11/15.
 */
public abstract class Binding implements Observer {
    private PortConfiguration portConfiguration;
    private Port portSource;

    public Binding(Port portSource, PortConfiguration portConfiguration){
        this.portConfiguration = portConfiguration;
        this.portSource = portSource;
    }

    public Port getPortSource(){
        return this.portSource;
    }

    public PortConfiguration getPortConfiguration() {
        return portConfiguration;
    }
}
