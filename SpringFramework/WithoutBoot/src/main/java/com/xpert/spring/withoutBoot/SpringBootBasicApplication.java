package com.xpert.spring.withoutBoot;

import com.xpert.spring.withoutBoot.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan // if no package not specified then it is the current package.
public class SpringBootBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootBasicApplication.class);

	public static void main(String[] args) {
		// Application Context manages all the instances of the beans
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringBootBasicApplication.class);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		binarySearch.search(new int[]{1,2,3,4}, 3);

		LOGGER.info(binarySearch.toString());
	}

}
