package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez")
                .peek(System.out::println)
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Jorge"));

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
