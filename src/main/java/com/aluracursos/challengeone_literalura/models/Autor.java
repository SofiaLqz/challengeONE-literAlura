package com.aluracursos.challengeone_literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Autor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") String anioNacimiento,
        @JsonAlias("death_year") String anioFallecimiento
) {
}
