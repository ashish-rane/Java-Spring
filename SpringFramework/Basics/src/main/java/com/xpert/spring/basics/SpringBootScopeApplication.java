package com.xpert.spring.basics;

import com.xpert.spring.basics.basic.BinarySearchImpl;
import com.xpert.spring.basics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootScopeApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootScopeApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = SpringApplication.run(SpringBootScopeApplication.class, args);

		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO1 = context.getBean(PersonDAO.class);

		// Print first instance
		LOGGER.info(personDAO.toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());

		//Print second instance
		LOGGER.info(personDAO1.toString());
		LOGGER.info(personDAO1.getJdbcConnection().toString());

		// By default All Spring managed instances will be singleton
		// i.e within an application context if we request  a bean of the same type we always get the same object.

		// For Scoped Proxy if we call getJdbcConnection() it returns a new instance.
		LOGGER.info(personDAO.getJdbcConnection().toString());
		LOGGER.info(personDAO.getJdbcConnection().toString());
	}

}
