package com.sdn02.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sdn02ServicioEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sdn02ServicioEurekaServerApplication.class, args);
	}
}
