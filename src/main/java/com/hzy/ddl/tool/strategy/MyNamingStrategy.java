package com.hzy.ddl.tool.strategy;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;

/**
* 类描述：名称规则
* 创建者： zhiyongh
* 项目名称： tool
* 创建时间： 2012-9-4 上午05:14:47
* 版本号： v1.0
*/
public class MyNamingStrategy extends ImprovedNamingStrategy implements
		NamingStrategy {

	private static final long serialVersionUID = 2091622485169630599L;

	@Override
	public String columnName(String columnName) {
		return addUnderscores(columnName).toUpperCase();
	}

	@Override
	public String tableName(String tableName) {
		return addUnderscores(tableName).toUpperCase();
	}

	@Override
	public String classToTableName(String className) {
		return "T_" + tableName(className);
	}

	@Override
	public String propertyToColumnName(String propertyName) {
		return addUnderscores(propertyName).toUpperCase();
	}
}