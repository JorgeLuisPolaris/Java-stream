package org.jorge.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamGenerate {
    public static void main(String[] args) {
        AtomicInteger c = new AtomicInteger(0);
        Stream.generate(()->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return c.getAndIncrement();
        }).limit(20)
        .forEach(System.out::println);
    }
}
