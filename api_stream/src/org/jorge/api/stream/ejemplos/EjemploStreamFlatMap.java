package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u ->{
                    if(u.getNombre().equalsIgnoreCase("Jorge")){
                        return Stream.of(u);
                    }else return Stream.empty();
                });
        nombres.forEach(System.out::println);
    }
}
