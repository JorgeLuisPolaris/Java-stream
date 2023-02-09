package org.jorge.api.stream.ejemplos;

import org.jorge.api.stream.ejemplos.modelo.Factura;
import org.jorge.api.stream.ejemplos.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Jorge","Mendez");
        Usuario u2 = new Usuario("Pepe","Jimenez");
        u1.addFactura(new Factura("Factura 1"));
        u1.addFactura(new Factura("Factura 2"));
        u2.addFactura(new Factura("Factura 3"));
        u2.addFactura(new Factura("Factura 4"));
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.stream()
                .flatMap(usuario -> usuario.getFacturas()
                        .stream())
                        .forEach(factura -> System.out.println("factura= " + factura.getDescripcion().concat(" : cliente ")
                                .concat(factura.getUsuario().getNombre())));
       /* for(Usuario u : usuarios){
            for (Factura f : u.getFacturas()){
                System.out.println("f.getDescripcion() = " + f.getDescripcion());
            }
        }*/
    }
}
