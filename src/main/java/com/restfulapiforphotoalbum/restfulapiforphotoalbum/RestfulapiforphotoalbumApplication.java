package com.restfulapiforphotoalbum.restfulapiforphotoalbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "Demo-API", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class RestfulapiforphotoalbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulapiforphotoalbumApplication.class, args);
	}

}
