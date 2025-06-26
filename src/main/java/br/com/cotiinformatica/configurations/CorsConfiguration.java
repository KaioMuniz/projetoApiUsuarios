package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Aplica a todas as rotas
				.allowedOrigins("*") // Permite requisições de qualquer origem (ou especifique:
										// "http://localhost:4200")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
				.allowedHeaders("*") // Cabeçalhos permitidos
				.allowCredentials(false); // Permite envio de credenciais (cookies, auth headers etc.)
	}
}
