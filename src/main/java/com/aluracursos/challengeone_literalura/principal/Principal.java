package com.aluracursos.challengeone_literalura.principal;

import com.aluracursos.challengeone_literalura.models.DatosRespuesta;
import com.aluracursos.challengeone_literalura.models.Libro;
import com.aluracursos.challengeone_literalura.service.ConversorDatos;
import com.aluracursos.challengeone_literalura.service.UsarApi;

import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final String URL_BASE = "https://gutendex.com/books/?search=";
    private Scanner scanner = new Scanner(System.in);
    private UsarApi usarApi = new UsarApi();
    private ConversorDatos conversor = new ConversorDatos();

    public void imprimirMenu(){
        var opcion = -1;
        while (opcion != 0) {
            System.out.println("""
                    ************************************************************
                            ********************************************
                                      Bienvenido/a a LiterAlura
                            ********************************************
                                        
                    --------------------------Opciones--------------------------
                    
                    1- Buscar libro
                    2- Mostrar libros 
                    3- Mostrar autores 
                    4- Mostrar autores vivos en determinado año
                    5- Mostrar libros por idioma
                    0- Salir
                    
                    ------------------------------------------------------------
                    ************************************************************
                    
                    Seleccione una opción:
                    """);
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    buscarLibro();
                    break;
                case 2:
                   mostrarLibros();
                    break;
                case 3:
                    mostrarAutores();
                    break;
                case 4:
                    System.out.println("Ingrese un año");
                    var anio = scanner.nextInt();
                    mostrarAutoresVivosPorAnio(anio);
                    break;
                case 5:
                    System.out.println("""
                    Seleccione un idioma:
                    
                    """);
                    var opcionIdioma = scanner.nextInt();
                    mostrarLibrosPorIdioma();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
            }


        }
    }

    private void mostrarLibrosPorIdioma() {
    }

    private void mostrarAutoresVivosPorAnio(int anio) {
    }

    private void mostrarAutores() {
    }

    private void buscarLibro() {
        System.out.println("Ingrese el nombre del libro que desea buscar");
        String nombreLibro = scanner.nextLine();
        var json = usarApi.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
//        System.out.println(json);
        var datosBusqueda = conversor.obtenerDatos(json, DatosRespuesta.class);
//        System.out.println(datosBusqueda);
        Optional<Libro> libroUsuario = datosBusqueda.resultados().stream().
                filter(l -> l.titulo().toLowerCase().contains(nombreLibro.toLowerCase())).findFirst();
        if (libroUsuario.isPresent()) {
            var libroEncontrado = libroUsuario.get();
            System.out.println(libroEncontrado);
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    private void mostrarLibros() {
    }
}
