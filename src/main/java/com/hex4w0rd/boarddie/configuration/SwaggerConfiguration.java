package com.hex4w0rd.boarddie.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpHeaders;

@OpenAPIDefinition(info = @Info(
        title = "Boarddie organizer API",
        description = "Organize your work and lifestyle",
        version = "1.0.0",
        contact = @Contact(
                name = "Emanuel Sotomayor",
                email = "emanuel.sotomayor.sec@gmail.com"
        )
), servers = @Server(
        description = "Local server",
        url = "http://localhost:8081"
), security = @SecurityRequirement(
        name = "Security token"
))
@SecurityScheme(
        name = "Security token",
        description = "Access token for API",
        type = SecuritySchemeType.HTTP,
        paramName = HttpHeaders.AUTHORIZATION,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfiguration {
}