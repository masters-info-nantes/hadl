package org.alma.csa.metamodele;

import org.alma.csa.App;
import org.alma.csa.hadl.composants.Configuration;
import org.alma.csa.hadl.liens.attachement.AttachementFourni;
import org.alma.csa.hadl.liens.attachement.AttachementRequis;
import org.alma.csa.metamodele.client.Client;
import org.alma.csa.metamodele.connecteur.LienClientF;
import org.alma.csa.metamodele.connecteur.LienServeurR;
import org.alma.csa.metamodele.connecteur.RpcClientServeur;
import org.alma.csa.metamodele.server.Serveur;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jeremy on 05/12/2015.
 */
public class Application extends Configuration {
    public Application(Serveur serveur, Client client,
                       RpcClientServeur connecteurRpc,
                       LienClientF lienClientF, LienServeurR lienServeurR)
    {
        super.ajouterComposant(serveur);
        super.ajouterComposant(client);

        Set<AttachementFourni> attachementsFournis = new HashSet<>();
        attachementsFournis.addAll(Arrays.asList(lienClientF));

        Set<AttachementRequis> attachementsRequis = new HashSet<>();
        attachementsRequis.addAll(Arrays.asList(lienServeurR));

        super.ajouterConnecteur(
            serveur, client,
            connecteurRpc,
            attachementsFournis, attachementsRequis
        );
    }
}
