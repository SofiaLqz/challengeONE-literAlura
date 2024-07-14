package com.aluracursos.challengeone_literalura;

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
		var usarApi = new UsarApi();
		String json = usarApi.obtenerDatos("https://gutendex.com/books/");
		System.out.println(json);
	}
}
