package test.base;

import java.sql.Connection;

import javax.sql.DataSource;



public class Test extends TestBase {
	//private static Logger log = Logger.getLogger(Test.class);
	
	DataSource dataSource = (DataSource)getApplicationContext().getBean("dataSource");
	
	public void testGet() throws Exception{
		 System.out.println("lst.size()");
		
		Connection conn = dataSource.getConnection();
	    
	    assertEquals(conn!=null, true);
	    
	    conn.close();
	}
	
}
