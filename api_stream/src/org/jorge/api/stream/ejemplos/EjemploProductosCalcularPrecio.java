package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EjemploProductosCalcularPrecio {
    public static void main(String[] args) {
        List<Producto> productos= new ArrayList<>();
        productos.add(new Producto(50.50,10));
        productos.add(new Producto(10.20,5));
        productos.add(new Producto(25.10,20));


        Function<List<Producto>, Double> calcularPrecio = (productosListas)->{
            Double calcPrecio = productosListas.stream()
                    .map(producto -> producto.getPrecio()* producto.getCantidad())
                    .reduce(Double.valueOf(0),(a, b)->a+b);
            return calcPrecio;
        };

        System.out.println("calcPrecio = " + calcularPrecio.apply(productos));

    }
}
