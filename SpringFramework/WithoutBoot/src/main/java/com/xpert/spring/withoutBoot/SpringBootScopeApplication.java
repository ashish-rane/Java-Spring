package com.xpert.spring.withoutBoot;

import com.xpert.spring.withoutBoot.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBootScopeApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootScopeApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBootScopeApplication.class)) {

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

			//context.close();
		}
	}

}
