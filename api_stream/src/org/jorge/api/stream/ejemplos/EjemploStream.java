package org.jorge.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        //Crear stream con los diferentes métodos
        Stream<String> nombres = Stream.of("Jorge","Pedro", "Juan");
        nombres.forEach(System.out::println);

        String[] arg ={"Jorge","Pedro", "Juan"};

        Stream<String> nombres2 = Arrays.stream(arg);

        nombres2.forEach(System.out::println);

        Stream<String> nombres3 =  Stream.<String>builder().add("Pato").add("Juan").add("Pedrito").build();

        nombres3.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Juan");
        lista.add("Coco");

        Stream<String>nombres4 = lista.stream();

        nombres4.forEach(System.out::println);



    }
}
