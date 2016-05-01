package test.hzy;

import java.lang.reflect.Method;

import javax.persistence.Column;

import com.hzy.ddl.tool.domain.Sample;


/**
 * Company:Dll-Tool<br />
 * Comments:获取类中的列属性及resultMap<br />
 * Create date:2012-3-27 下午05:43:08<br />
 * @author zhiyongh
 * @version 1.0
*/
public class TestGetColumns {

	
	public static void main(String[] args){
	 
		Class cls = Sample.class;
		Method [] methods=cls.getDeclaredMethods();//取得model方法
        StringBuffer properties = new StringBuffer();
        StringBuffer columns = new StringBuffer();
        StringBuffer resultMap = new StringBuffer();
        
		for(Method method : methods){
			String key = method.getName();
			if(!key.startsWith("get")){
				continue;
			}
			key = key.substring(3,4).toLowerCase() + key.substring(4);
			Column colAnnotation=method.getAnnotation(Column.class);//得到方法的Annotation
			if(colAnnotation!=null){
				properties.append("t.").append(key).append(",");
				columns.append("t.").append(colAnnotation.name()).append(",");
				resultMap.append("\r\n	 <result property=\"").append(key).append("\" column=\"").append(colAnnotation.name()).append("\"/>");
			}
		}
		
		System.out.println("hql: "+properties);
		System.out.println();
		System.out.println("sql: select "+columns + " from ");
		
		System.out.println();
		System.out.print(" <resultMap id=\""+cls.getSimpleName()+"Result\" class=\""+cls.getName()+"\">");
		System.out.println(resultMap);
		System.out.println(" </resultMap>"); 
  }
}
