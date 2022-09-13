package com.microservicesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicrroservicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrroservicesServerApplication.class, args);
	}

}
