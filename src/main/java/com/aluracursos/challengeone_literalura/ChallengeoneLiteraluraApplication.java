package com.aluracursos.challengeone_literalura;

import com.aluracursos.challengeone_literalura.models.DatosRespuesta;
import com.aluracursos.challengeone_literalura.principal.Principal;
import com.aluracursos.challengeone_literalura.service.ConversorDatos;
import com.aluracursos.challengeone_literalura.service.UsarApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeoneLiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeoneLiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.imprimirMenu();
	}
}
