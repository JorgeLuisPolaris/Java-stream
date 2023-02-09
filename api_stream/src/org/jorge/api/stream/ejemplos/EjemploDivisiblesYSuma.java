package org.jorge.api.stream.ejemplos;


import java.util.DoubleSummaryStatistics;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.DoubleStream;


public class EjemploDivisiblesYSuma {
    public static void main(String[] args) {
        AtomicInteger c = new AtomicInteger(1);
        DoubleStream datos = DoubleStream.generate(()->{
            return c.getAndIncrement();
        }).limit(100)
        .filter(i -> i%10!=0)
        .map(div -> {
            return (double)div/2;
        });
        
        DoubleSummaryStatistics stats = datos.summaryStatistics();
        System.out.println("stats.getSum() = " + stats.getSum());

    }
}
