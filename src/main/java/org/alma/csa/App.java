package org.alma.csa;

import org.alma.csa.metamodele.server.composants.connection.ConnectionManager;
import org.alma.csa.metamodele.server.composants.connection.ports.*;
import org.alma.csa.metamodele.server.composants.connection.services.*;
import org.alma.csa.metamodele.server.composants.database.Database;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseFourni;
import org.alma.csa.metamodele.server.composants.database.ports.QueryDatabaseRequis;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerFourni;
import org.alma.csa.metamodele.server.composants.database.ports.SecurityManagerRequis;
import org.alma.csa.metamodele.server.composants.database.services.ServiceQueryDatabaseF;
import org.alma.csa.metamodele.server.composants.database.services.ServiceQueryDatabaseR;
import org.alma.csa.metamodele.server.composants.database.services.ServiceSecurityManagerF;
import org.alma.csa.metamodele.server.composants.database.services.ServiceSecurityManagerR;
import org.alma.csa.metamodele.server.composants.security.SecurityManager;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryFourni;
import org.alma.csa.metamodele.server.composants.security.ports.CheckQueryRequis;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthFourni;
import org.alma.csa.metamodele.server.composants.security.ports.SecurityAuthRequis;
import org.alma.csa.metamodele.server.composants.security.services.ServiceCheckQueryF;
import org.alma.csa.metamodele.server.composants.security.services.ServiceCheckQueryR;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthF;
import org.alma.csa.metamodele.server.composants.security.services.ServiceSecurityAuthR;
import org.alma.csa.metamodele.server.connecteurs.ClearanceRequest;
import org.alma.csa.metamodele.server.connecteurs.SecurityQuery;
import org.alma.csa.metamodele.server.connecteurs.SqlQuery;
import org.alma.csa.metamodele.server.connecteurs.connection.database.*;
import org.alma.csa.metamodele.server.connecteurs.connection.security.*;
import org.alma.csa.metamodele.server.connecteurs.database.connection.*;
import org.alma.csa.metamodele.server.connecteurs.database.security.*;
import org.alma.csa.metamodele.server.connecteurs.security.connection.*;
import org.alma.csa.metamodele.server.connecteurs.security.database.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Port Connection Manager
        DBQueryFourni dBQueryFourni = new DBQueryFourni();
        DBQueryRequis dBQueryRequis = new DBQueryRequis();
        ExternalSocketFourni externalSocketFourni = new ExternalSocketFourni();
        ExternalSocketRequis externalSocketRequis = new ExternalSocketRequis();
        SecurityCheckFourni securityCheckFourni = new SecurityCheckFourni();
        SecurityCheckRequis securityCheckRequis = new SecurityCheckRequis();

        //Service Connection Manager
        ServiceDBQueryF serviceDBQueryF = new ServiceDBQueryF(dBQueryFourni);
        ServiceDBQueryR serviceDBQueryR = new ServiceDBQueryR(dBQueryRequis);
        ServiceExternalSocketF serviceExternalSocketF = new ServiceExternalSocketF(externalSocketFourni);
        ServiceExternalSocketR serviceExternalSocketR = new ServiceExternalSocketR(externalSocketRequis);
        ServiceSecurityCheckF serviceSecurityCheckF = new ServiceSecurityCheckF(securityCheckFourni);
        ServiceSecurityCheckR serviceSecurityCheckR = new ServiceSecurityCheckR(securityCheckRequis);

        //Connection Manager
        ConnectionManager connectionManager = new ConnectionManager(serviceDBQueryF,serviceDBQueryR,serviceExternalSocketF,serviceExternalSocketR,serviceSecurityCheckF,serviceSecurityCheckR);



        //Port Database
        QueryDatabaseFourni queryDatabaseFourni = new QueryDatabaseFourni();
        QueryDatabaseRequis queryDatabaseRequis = new QueryDatabaseRequis();
        SecurityManagerFourni securityManagerFourni = new SecurityManagerFourni();
        SecurityManagerRequis securityManagerRequis = new SecurityManagerRequis();

        //Service Database
        ServiceQueryDatabaseF serviceQueryDatabaseF = new ServiceQueryDatabaseF(queryDatabaseFourni);
        ServiceQueryDatabaseR serviceQueryDatabaseR = new ServiceQueryDatabaseR(queryDatabaseRequis);
        ServiceSecurityManagerF serviceSecurityManagerF = new ServiceSecurityManagerF(securityManagerFourni);
        ServiceSecurityManagerR serviceSecurityManagerR = new ServiceSecurityManagerR(securityManagerRequis);

        //Database
        Database database = new Database(serviceQueryDatabaseF,serviceQueryDatabaseR,serviceSecurityManagerF,serviceSecurityManagerR);



        //Port Security
        CheckQueryFourni checkQueryFourni = new CheckQueryFourni();
        CheckQueryRequis checkQueryRequis = new CheckQueryRequis();
        SecurityAuthFourni securityAuthFourni = new SecurityAuthFourni();
        SecurityAuthRequis securityAuthRequis = new SecurityAuthRequis();

        //Service Security
        ServiceCheckQueryF serviceCheckQueryF = new ServiceCheckQueryF(checkQueryFourni);
        ServiceCheckQueryR serviceCheckQueryR = new ServiceCheckQueryR(checkQueryRequis);
        ServiceSecurityAuthF serviceSecurityAuthF = new ServiceSecurityAuthF(securityAuthFourni);
        ServiceSecurityAuthR serviceSecurityAuthR = new ServiceSecurityAuthR(securityAuthRequis);

        //Security
        SecurityManager securityManager = new SecurityManager(serviceCheckQueryF,serviceCheckQueryR,serviceSecurityAuthF,serviceSecurityAuthR);



        //Role Connection - Database
        RoleDbQueryF roleDbQueryF = new RoleDbQueryF();
        RoleDbQueryR roleDbQueryR = new RoleDbQueryR();
        RoleQueryDatabaseF roleQueryDatabaseF = new RoleQueryDatabaseF();
        RoleQueryDatabaseR roleQueryDatabaseR = new RoleQueryDatabaseR();

        //Glue Connection - Database
        GlueConnectionDatabase glueConnectionDatabase = new GlueConnectionDatabase(roleDbQueryR,roleQueryDatabaseF);
        GlueDatabaseConnection glueDatabaseConnection = new GlueDatabaseConnection(roleQueryDatabaseR,roleDbQueryF);

        //Attachement Connection - Database
        LienDbQueryF lienDbQueryF = new LienDbQueryF(dBQueryFourni,roleDbQueryR);
        LienDbQueryR lienDbQueryR = new LienDbQueryR(dBQueryRequis,roleDbQueryF);
        LienQueryDatabaseF lienQueryDatabaseF = new LienQueryDatabaseF(queryDatabaseFourni,roleQueryDatabaseR);
        LienQueryDatabaseR lienQueryDatabaseR = new LienQueryDatabaseR(queryDatabaseRequis,roleQueryDatabaseF);



        //Role Connection - Security
        RoleSecurityAuthF roleSecurityAuthF = new RoleSecurityAuthF();
        RoleSecurityAuthR roleSecurityAuthR = new RoleSecurityAuthR();
        RoleSecurityCheckF roleSecurityCheckF = new RoleSecurityCheckF();
        RoleSecurityCheckR roleSecurityCheckR = new RoleSecurityCheckR();

        //Glue Connection - Security
        GlueConnectionSecurity glueConnectionSecurity = new GlueConnectionSecurity(roleSecurityCheckR,roleSecurityAuthF);
        GlueSecurityConnection glueSecurityConnection = new GlueSecurityConnection(roleSecurityAuthR,roleSecurityCheckF);

        //Attachement Connection - Security
        LienSecurityCheckF lienSecurityCheckF = new LienSecurityCheckF(securityCheckFourni,roleSecurityCheckR);
        LienSecurityCheckR lienSecurityCheckR = new LienSecurityCheckR(securityCheckRequis,roleSecurityCheckF);
        LienSecurityAuthF lienSecurityAuthF = new LienSecurityAuthF(securityAuthFourni,roleSecurityAuthR);
        LienSecurityAuthR lienSecurityAuthR = new LienSecurityAuthR(securityAuthRequis,roleSecurityAuthF);



        //Role Database - Security
        RoleCheckQueryF roleCheckQueryF = new RoleCheckQueryF();
        RoleCheckQueryR roleCheckQueryR = new RoleCheckQueryR();
        RoleSecurityManagerF roleSecurityManagerF = new RoleSecurityManagerF();
        RoleSecurityManagerR roleSecurityManagerR = new RoleSecurityManagerR();

        //Glue Database - Security
        GlueDatabaseSecurity glueDatabaseSecurity = new GlueDatabaseSecurity(roleSecurityManagerR,roleCheckQueryF);
        GlueSecurityDatabase glueSecurityDatabase = new GlueSecurityDatabase(roleCheckQueryR,roleSecurityManagerF);

        //Attachement Database - Security
        LienSecurityManagerF lienSecurityManagerF = new LienSecurityManagerF(securityManagerFourni,roleSecurityManagerR);
        LienSecurityManagerR lienSecurityManagerR = new LienSecurityManagerR(securityManagerRequis,roleSecurityManagerF);
        LienCheckQueryF lienCheckQueryF = new LienCheckQueryF(checkQueryFourni,roleCheckQueryR);
        LienCheckQueryR lienCheckQueryR = new LienCheckQueryR(checkQueryRequis,roleCheckQueryF);



        //Connecteur
        ClearanceRequest clearanceRequest = new ClearanceRequest(glueConnectionSecurity,glueSecurityConnection);
        SecurityQuery securityQuery = new SecurityQuery(glueSecurityDatabase,glueDatabaseSecurity);
        SqlQuery sqlQuery = new SqlQuery(glueConnectionDatabase,glueDatabaseConnection);


    }
}
