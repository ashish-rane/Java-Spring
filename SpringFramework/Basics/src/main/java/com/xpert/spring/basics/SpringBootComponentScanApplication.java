package com.xpert.spring.basics;

import com.xpert.spring.basics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.xpert.spring.componentscan.ComponentDAO;
import com.xpert.spring.componentscan.ComponentJdbcConnection;

// The ComponentScan tells spring which packages to search for components.
// By default it will search for components in the package belonging to the spring boot application class.
@SpringBootApplication
@ComponentScan("com.xpert.spring.componentscan")
public class SpringBootComponentScanApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootComponentScanApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = SpringApplication.run(SpringBootComponentScanApplication.class, args);

		ComponentDAO componentDAO= context.getBean(ComponentDAO.class);

		LOGGER.info(componentDAO.toString());
		LOGGER.info(componentDAO.getJdbcConnection().toString());
	}

}
