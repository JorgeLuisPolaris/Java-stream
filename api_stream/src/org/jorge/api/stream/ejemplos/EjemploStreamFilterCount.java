package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {
        long cantidad = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .count();

        System.out.println("cantidad = " + cantidad);

    }
}
