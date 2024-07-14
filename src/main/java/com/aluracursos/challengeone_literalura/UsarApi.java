package com.aluracursos.challengeone_literalura;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UsarApi {
    public String obtenerDatos(String direccion) {
        var client = HttpClient.newHttpClient();
        // Solicitud
        var request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {

            // Respuesta
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            return "Error al consultar a la API: " + e.getMessage();
        }
    }
}
