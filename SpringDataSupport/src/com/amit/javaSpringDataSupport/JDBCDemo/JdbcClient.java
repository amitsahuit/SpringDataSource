package com.amit.javaSpringDataSupport.JDBCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amit.javaSpringDataSupport.JDBCDemo.Dao.JdbcDaoImpl;
import com.amit.javaSpringDataSupport.JDBCDemo.module.Circle;

public class JdbcClient {

	public static void main(String[] args) {
		
		/*Circle circle = new JdbcDaoImpl().getCircle(1);
		  System.out.println(circle.getName());*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringDataSupport.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		Circle circle = dao.getCircle(1);
		System.out.println(circle.getName());
		
	}

}
