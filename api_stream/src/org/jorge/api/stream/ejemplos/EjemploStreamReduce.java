package org.jorge.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez","Jorge Perez","Jorge Perez")
                .distinct();

        String resultado = nombres.reduce("Resultado ",(a,b)->a+ ", " + b);
        System.out.println(resultado);





    }
}
