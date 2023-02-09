package org.jorge.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        IntStream nombres = IntStream
                .rangeClosed(5,20).peek(System.out::println);

        //Integer resultado = nombres.reduce(0,(a,b)->a+ b);
        //int resultado = nombres.sum();

        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getMin() = " + stats.getMin());
        System.out.println("stats.getCount() = " + stats.getCount());
        System.out.println("stats.getSum() = " + stats.getSum());
       // System.out.println(resultado);





    }
}
