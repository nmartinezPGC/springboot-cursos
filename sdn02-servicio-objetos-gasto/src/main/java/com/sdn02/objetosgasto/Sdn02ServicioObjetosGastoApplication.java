package com.sdn02.objetosgasto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.sdn02.commons.usuarios.models.entity", "com.sdn02.objetosgasto.models.entity" })
public class Sdn02ServicioObjetosGastoApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sdn02ServicioObjetosGastoApplication.class, args);
	}
}
