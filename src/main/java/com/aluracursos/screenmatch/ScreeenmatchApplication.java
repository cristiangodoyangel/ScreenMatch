package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.principal.EjemploStreams;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreeenmatchApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(ScreeenmatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	/*	Principal principal = new Principal();
		principal.muestraElMenu(); */
		EjemploStreams ejemploStreams = new EjemploStreams();
		ejemploStreams.muestraEjemplo();



	}
}