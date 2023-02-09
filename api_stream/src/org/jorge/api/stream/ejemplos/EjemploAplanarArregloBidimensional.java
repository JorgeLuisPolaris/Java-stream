package org.jorge.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploAplanarArregloBidimensional {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Stream mapa= Stream.of(lenguajes)
                .flatMap(dato-> Arrays.stream(dato))
                .distinct();

        mapa.forEach(System.out::println);
    }
}
