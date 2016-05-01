package test.hzy;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hzy.ddl.tool.domain.Sample;

/**
* 类描述：提取DDL
* 创建者： zhiyongh
* 项目名称： tool
* 创建时间： 2012-9-4 上午06:25:10
* 版本号： v1.0
*/
public class TestDDL {

	
	public static void main(String[] args){
		
		Configuration cfg = new Configuration()
		.addAnnotatedClass(Sample.class);
		
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		cfg.setProperty("hibernate.hbm2ddl.auto", "update");
		cfg.setProperty("hibernate.format_sql", "true");
		
		System.out.println("1");
	    SchemaExport export = new SchemaExport(cfg); 
	    System.out.println("2");
	    
	    export.setOutputFile("myschema.sql");  

	    export.create(true, false);
	}
}
