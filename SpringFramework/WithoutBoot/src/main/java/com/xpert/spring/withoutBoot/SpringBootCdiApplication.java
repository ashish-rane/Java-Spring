package com.xpert.spring.withoutBoot;

import com.xpert.spring.withoutBoot.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBootCdiApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootCdiApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootCdiApplication.class);

		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);

		LOGGER.info(someCdiBusiness.toString());
		LOGGER.info(someCdiBusiness.getSomeCdiDao().toString());
	}

}
