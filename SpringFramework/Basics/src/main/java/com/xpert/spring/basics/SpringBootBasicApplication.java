package com.xpert.spring.basics;

import com.xpert.spring.basics.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	private static  Logger LOGGER = LoggerFactory.getLogger(SpringBootBasicApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context = SpringApplication.run(SpringBootBasicApplication.class, args);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		binarySearch.search(new int[]{1,2,3,4}, 3);

		LOGGER.info(binarySearch.toString());
	}

}
