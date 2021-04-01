package com.cocoall.forkedkawa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // url swagger : http://localhost:8080/swagger-ui.html#/
public class MagicDeckManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicDeckManagerApplication.class, args);
	}

}
