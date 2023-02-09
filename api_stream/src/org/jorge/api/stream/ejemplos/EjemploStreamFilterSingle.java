package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getId()==10)
                .findFirst().get();
                //.orElse(new Usuario("Luis","Postri"));
               // .orElseGet(()-> new Usuario("Luis", "mendez"));

        System.out.println("usuario = " + usuario);

    }
}
