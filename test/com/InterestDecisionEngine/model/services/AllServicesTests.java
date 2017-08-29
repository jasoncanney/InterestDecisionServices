package com.InterestDecisionEngine.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.InterestDecisionEngine.model.services.applicationservice.AppSvcHibernateImplTest;
import com.InterestDecisionEngine.model.services.applicationservice.ApplicationSvcTst;
import com.InterestDecisionEngine.model.services.loginservice.LoginSvcHibernateImplTest;
import com.InterestDecisionEngine.model.services.manager.SAXPropertyManagerTst;
import com.InterestDecisionEngine.model.services.releaseservice.ReleaseSvcTest;
/** Test suite runs all service level tests */
@RunWith(Suite.class)
@SuiteClasses({ 
		SAXPropertyManagerTst.class,
		AppSvcHibernateImplTest.class,
        ApplicationSvcTst.class,
        ReleaseSvcTest.class,
        LoginSvcHibernateImplTest.class,
        HibernateFactoryTest.class
})
public class AllServicesTests {

}
