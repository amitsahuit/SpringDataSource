package com.amit.javaSpringDataSupport.JDBCDemo.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SimpleJdbcDaoImpl extends JdbcDaoSupport {

	//Gets the count of the records from Circle table. 
		public int getCircleCount() {
			String sql = "SELECT COUNT(*) FROM CIRCLE";
			return this.getJdbcTemplate().queryForObject(sql, Integer.class);
		}
}
