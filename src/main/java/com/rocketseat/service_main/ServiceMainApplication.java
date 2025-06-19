package com.rocketseat.service_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Identifica para o Spring que essa aplicação é um servidor Eureka
@EnableEurekaServer
// Identifica para o Spring que essa aplicação é um servidor de configuração (Spring Cloud Config Server)
@EnableConfigServer
public class ServiceMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMainApplication.class, args);
	}

}
