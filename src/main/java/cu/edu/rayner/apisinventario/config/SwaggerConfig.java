package cu.edu.rayner.apisinventario.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI createOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Swagger API Inventario")
                        .description("Api para el inventario").version("v1")
                        .contact(new Contact().name("Rayner Alejandro Soto Martìnez").email("raynersoto01@gmail.com"))
                        .version("1.0"));
    }
}
