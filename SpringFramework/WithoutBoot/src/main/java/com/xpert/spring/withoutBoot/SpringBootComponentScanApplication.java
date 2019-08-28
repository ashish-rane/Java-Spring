package com.xpert.spring.withoutBoot;

import com.xpert.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// The ComponentScan tells spring which packages to search for components.
// By default it will search for components in the package belonging to the spring boot application class.
@Configuration
@ComponentScan
@ComponentScan("com.xpert.spring.componentscan")
public class SpringBootComponentScanApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootComponentScanApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootComponentScanApplication.class);

		ComponentDAO componentDAO= context.getBean(ComponentDAO.class);

		LOGGER.info(componentDAO.toString());
		LOGGER.info(componentDAO.getJdbcConnection().toString());
	}

}
