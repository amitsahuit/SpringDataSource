package com.amit.javaSpringDataSupport.JDBCDemo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.amit.javaSpringDataSupport.JDBCDemo.module.Circle;

@Component
public class SpringDaoImpl {

	@Autowired
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource dataSource) {
		//this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getCircleCount() {
		String sql = "SELECT COUNT(*) FROM CIRCLE";
		jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	/*
	 * public Circle getCircle(int circleId) {
	 * 
	 * Connection conn = null;
	 * 
	 * try {
	 * 
	 * //Connection String driver = "org.apache.derby.jdbc.ClientDriver";
	 * Class.forName(driver).newInstance(); conn =
	 * DriverManager.getConnection("jdbc:derby://localhost:1527/db");
	 * 
	 * conn = datasource.getConnection();
	 * 
	 * //Prepared statement PreparedStatement ps =
	 * conn.prepareStatement("select * from circle where id=?"); ps.setInt(1,
	 * circleId);
	 * 
	 * //Executing the query Circle circle = null; ResultSet rs = ps.executeQuery();
	 * 
	 * //Passing throught he result set to get the output. if(rs.next()) { circle =
	 * new Circle(circleId, rs.getString("name")); } rs.close(); ps.close();
	 * 
	 * return circle;
	 * 
	 * }catch(Exception e) { throw new RuntimeException(e); }finally { try {
	 * conn.close(); }catch(SQLException se) {
	 * 
	 * } } }
	 */

}
