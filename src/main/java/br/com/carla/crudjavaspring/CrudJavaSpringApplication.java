package br.com.carla.crudjavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CrudJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJavaSpringApplication.class, args);
	}

}
