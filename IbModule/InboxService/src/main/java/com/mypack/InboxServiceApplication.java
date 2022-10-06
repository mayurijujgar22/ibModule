package com.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaClient
//@EnableEurekaServer
public class InboxServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InboxServiceApplication.class, args);
	}

}
