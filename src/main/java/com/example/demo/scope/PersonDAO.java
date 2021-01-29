package com.example.demo.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {

	private static final Logger log = LoggerFactory.getLogger(PersonDAO.class);

	@Autowired
	JDBCConnection connection;

	public JDBCConnection getConnection() {
		return connection;
	}

	public void setConnection(JDBCConnection connection) {
		this.connection = connection;
	}

	@PostConstruct
	public void postConstruct() {
		log.info(">>> Post Construct of PersonDAO");
	}
	
	
	@PreDestroy
	public void preDestroy() {
		log.info(">>> Pre Destory of PersonDAO");
	}

}
