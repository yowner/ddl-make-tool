*******使用此快捷方法之前，必须在实体类中用注释说明好表名、字段属性
*******将model代码连接到本项目中


一、如何取得列名与属性名的对应列表？
1.test.hzy.TestGetColumns类中改为你要的model
2.运行TestGetColumns，控制台输出sql及ibatis resultMap对


二、如何利用hibernate生成表DLL语句？
1.test.hzy.TestDDL类中改为你要的model
2.运行TestDDL，控制台输出ddl或查看/tool/myschema.sql


第二种方法：(利用mvn插件hibernate3-maven-plugin)
1.在tool工程下的hibernate.xml中增加对应的model class
2.maven package
3.查看/tool/target/hibernate3/sql/schema.ddl或查看控制台输出

三、与数据库同步增加更新表结构（字段类型的变更请手工修改）
1.配置数据库连接 /tool/src/main/resources/applicationContext-dao-resource.xml
2.要增加或更新哪些model /tool/src/main/resources/hibernate.cfg.xml
3.运行test.hzy.TestUpdateDb

