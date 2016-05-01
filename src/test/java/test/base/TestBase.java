package test.base;


import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBase extends TestCase {
	public static ApplicationContext  applicationContext;	
	static  {
		if(applicationContext==null){
			applicationContext = new FileSystemXmlApplicationContext(
					"classpath:applicationContext-dao-resource.xml"
					
			//"file:WebRoot/WEB-INF/classes/test/base/testApplicationContext.xml"
					//"file:WebRoot/WEB-INF/classes/app-config/applicationContext-*.xml"
			);
			
		}
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	public static void setApplicationContext(ApplicationContext applicationContext) {
		TestBase.applicationContext = applicationContext;
	}

}
