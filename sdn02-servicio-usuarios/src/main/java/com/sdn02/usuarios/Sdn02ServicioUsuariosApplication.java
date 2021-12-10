package com.sdn02.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.sdn02.commons.usuarios.models.entity" })
public class Sdn02ServicioUsuariosApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sdn02ServicioUsuariosApplication.class, args);
	}
}
