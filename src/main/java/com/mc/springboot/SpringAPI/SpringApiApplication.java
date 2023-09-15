package com.mc.springboot.SpringAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		//scanBasePackages = {"com.mc.springboot.name of folder"}
)
public class SpringApiApplication {
// generate origin in https://start.spring.io with dependencies - Spring Web
	//exposing endpoints /actuator/help, info add library and to resources/application.properties add few lines
	// good for versioning so on

	// secourity again in properties

	//run from comand line withou ide in cmd run  ./mvnw package
	//it compile app only MAVEN projects!!!
	//cd target java -jar appname.jar
	//still run on local host

	//spring boot properties on spring page.
	//springboot app scan for @ in folder /SpringAPI
	//if i need scan outside of this folder lok on line 7

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

}
