package org.alma.csa.metamodele.server.bindings;

import org.alma.csa.hadl.liens.binding.BindingRequis;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketRequis;

/**
 * Created by jeremy on 23/11/15.
 */
public class BindingExternalSocketR extends BindingRequis {
    public BindingExternalSocketR(ExternalSocketRequis externalSocketR, ExternalSocketConfigR externalSocketConfigR){
        super(externalSocketR, externalSocketConfigR);
    }
}
