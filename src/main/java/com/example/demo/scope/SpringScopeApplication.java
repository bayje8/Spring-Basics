package com.example.demo.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.scope")
public class SpringScopeApplication {
	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(SpringScopeApplication.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringScopeApplication.class);

		PersonDAO bean1 = context.getBean(PersonDAO.class);
		PersonDAO bean2 = context.getBean(PersonDAO.class);

		logger.info("{}", bean1);
		System.out.println(bean1);
		System.out.println(bean2);
		logger.info("{}", bean2);

		JDBCConnection connection1 = bean1.getConnection();
		JDBCConnection connection2 = bean2.getConnection();
		JDBCConnection connection3 = bean2.getConnection();

		logger.info("{}", connection1);
		logger.info("{}", connection2);
		logger.info("{}", connection3);

		context.close();
	}
}
