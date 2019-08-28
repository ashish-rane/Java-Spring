package com.xpert.spring.basics;

import com.xpert.spring.basics.basic.BinarySearchImpl;
import com.xpert.spring.basics.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCdiApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootCdiApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = SpringApplication.run(SpringBootCdiApplication.class, args);

		SomeCdiBusiness someCdiBusiness = context.getBean(SomeCdiBusiness.class);

		LOGGER.info(someCdiBusiness.toString());
		LOGGER.info(someCdiBusiness.getSomeCdiDao().toString());
	}

}
