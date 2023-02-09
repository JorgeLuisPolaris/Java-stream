package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistictUsuario {
    public static void main(String[] args) {
        IntStream usuarios = Stream
                .of("Jorge Perez","Luis Jimenez","Mendez Sandra", "Jorge Mendez","Mendez Sandra","Mendez Sandra","Mendez Sandra")
                .map(nombre-> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()//como el distinct detecta diferentes instancias de objetos, aunque sus valores sean iguales no los quita, se ocupa programar el método equals en el modelo
                .mapToInt(u -> u.getNombre().length())
                .peek(System.out::println);
        // usuarios.forEach(System.out::println);
        IntSummaryStatistics stats = usuarios.summaryStatistics();
        System.out.println("stats.getCount() = " + stats.getCount());
        System.out.println("stats.getMin() = " + stats.getMin());
    }
}
