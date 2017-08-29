package com.InterestDecisionEngine.model.business.factory;

import junit.framework.TestCase;

import com.InterestDecisionEngine.model.business.exception.ServiceLoadException;
import com.InterestDecisionEngine.model.services.applicationservice.ApplicationSvcHibernateImpl;
import com.InterestDecisionEngine.model.services.factory.Factory;
import com.InterestDecisionEngine.model.services.applicationservice.IApplicationSvc;
import com.InterestDecisionEngine.model.services.releaseservice.IReleaseSvc;
import com.InterestDecisionEngine.model.services.releaseservice.ReleaseSvcHibernateImpl;
import org.apache.log4j.Logger;

/**
 * 
 * @author Jason Canney
 *
 */

public class FactoryTest extends TestCase {

	Factory factory;
	
        /*
	 * Category set in config/log4j.properties as
	 * log4j.category.com.classexercise=DEBUG, A1
	 */
        static Logger log = Logger.getLogger(FactoryTest.class);

	public void setUp() throws Exception {
		factory = Factory.getInstance();
	}

	public void testGetInstance() {
	       assertNotNull(factory);
		}
	
    /**
     * Test Factory to return the ApplicationSvc and assert it by 
     * checking it is an instance of ApplicationSvcImpl_Archive
     * 
     * This should be true since ApplicationSvcImpl_Archive implements IApplicationSvc
     */
	public void testGetApplicationService() {
 		IApplicationSvc applicationService;
		try {
			applicationService = (IApplicationSvc)factory.getService(IApplicationSvc.NAME);
	  	    assertTrue(applicationService instanceof ApplicationSvcHibernateImpl);
                    log.error ("testGetApplicationService");
		} catch (ServiceLoadException e) {
                        log.error ("ServiceLoadException triggered in testGetApplicationService", e); // logging serviceload exception
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

	/**
     * Test Factory to return the ReleaseSvc and assert it by 
     * checking it is an instance of ReleaseSvcImpl_Archive
     * 
     * This should be true since ReleaseSvcImpl_Archive implements IReleaseSvc
     */
	public void testGetReleaseService() {
 		IReleaseSvc releaseService;
		try {
			releaseService = (IReleaseSvc)factory.getService(IReleaseSvc.NAME);
	  	    assertTrue(releaseService instanceof ReleaseSvcHibernateImpl);
		} catch (ServiceLoadException e) {
                        log.error ("ServiceLoadException triggered in testGetReleaseService", e); // logging serviceload exception
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

	
	
	
}
