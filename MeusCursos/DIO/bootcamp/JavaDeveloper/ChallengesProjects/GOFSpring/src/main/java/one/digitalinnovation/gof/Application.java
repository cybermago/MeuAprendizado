package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author jonata
 * @version 2.0
 * 
 * Novas Alterações Testes com JUNIT e Tratamento de Exceções
 */
@EnableFeignClients
@SpringBootApplication
public final class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
