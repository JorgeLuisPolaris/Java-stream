package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploListaToStream {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Jorge","Luis"));
        usuarios.add(new Usuario("Pepe","Mendez"));
        usuarios.add(new Usuario("Juan","Presto"));
        usuarios.add(new Usuario("Luis","Sancro"));

        usuarios.stream().map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre ->{
                    if (nombre.contains("PEPE")){
                        return Stream.of(nombre);
                    }else {
                         return Stream.empty();
                    }
                }).forEach(System.out::println);



    }
}
