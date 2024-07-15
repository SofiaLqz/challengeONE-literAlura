package com.aluracursos.challengeone_literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Libro(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor> autor,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("download_count") Double numeroDescargas
) {
}
