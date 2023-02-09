package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .anyMatch(u -> u.getId()==1);

        System.out.println("existe = " + existe);

    }
}
