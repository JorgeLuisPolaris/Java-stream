package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        //con el map creamos un nuevo flujo, recordando que los streams son inmutables
        Stream<String> nombres = Stream.of("Pepe","Juan","Calamardo")
                .peek(e-> System.out.println("e = " + e))//sirve para ver qué hace durante el flujo
                .map(String::toUpperCase)
                .peek(e-> System.out.println("e = " + e)).
                map(String::toLowerCase);

       // nombres.forEach(System.out::println);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

        Stream<Usuario> nombres2 = Stream.of("Luis Mendez","Juan Alvarez","Luis Perez")

                .map(nombre-> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .map(usuario -> {
                    String nombre =  usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        List<Usuario> lista2 = nombres2.collect(Collectors.toList());
        lista2.forEach(System.out::println);

    }
}
