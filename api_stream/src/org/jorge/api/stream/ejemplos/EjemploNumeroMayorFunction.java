package org.jorge.api.stream.ejemplos;

import java.util.Arrays;
import java.util.function.Function;

public class EjemploNumeroMayorFunction {
    public static void main(String[] args) {
        Function<Integer[],Integer> max = (nums)->{
            return Arrays.stream(nums).reduce(0,(a,b)->a>b? a:b);
        };

        Integer[] nums={5,10,-20,1,5,500};
        System.out.println("max.apply(nums) = " + max.apply(nums));

    }
}
