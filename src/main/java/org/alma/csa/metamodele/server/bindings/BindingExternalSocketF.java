package org.alma.csa.metamodele.server.bindings;

import org.alma.csa.hadl.liens.binding.Binding;
import org.alma.csa.hadl.liens.binding.BindingFourni;
import org.alma.csa.metamodele.server.composants.connection.ports.ExternalSocketFourni;

/**
 * Created by jeremy on 23/11/15.
 */
public class BindingExternalSocketF extends BindingFourni {
    public BindingExternalSocketF(ExternalSocketFourni externalSocketF, ExternalSocketConfigF externalSocketConfigF){
        super(externalSocketF, externalSocketConfigF);
    }
}
