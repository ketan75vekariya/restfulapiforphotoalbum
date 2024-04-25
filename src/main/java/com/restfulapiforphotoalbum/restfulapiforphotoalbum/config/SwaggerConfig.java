package com.restfulapiforphotoalbum.restfulapiforphotoalbum.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Demo Api", version = "version 1.0.0", contact = @Contact(name = "Ketan Vekariya", email = "ketvek947@gmail.com", url = "https://www.google.com"), license = @License(name = "Apache 2.0", url = "https://www.apache.org/license/LICENSE-2.0"), termsOfService = "https://www.google.com", description = "Srping boot API by Ketan"))
public class SwaggerConfig {

}
