package com.sdn02.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class Sdn02ServicioZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sdn02ServicioZuulServerApplication.class, args);
	}

}
