package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez","Jorge Perez","Jorge Perez")
                .distinct();

        nombres.forEach(System.out::println);





    }
}
