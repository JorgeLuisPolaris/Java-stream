package org.jorge.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long nombres = Stream
                .of("Jorge Perez","","Mendez Sandra", "")
                .filter(n -> n.isEmpty())
                .count();
        System.out.println("nombres = " + nombres);


    }
}
