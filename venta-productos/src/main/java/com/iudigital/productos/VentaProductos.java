package com.iudigital.productos;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class VentaProductos {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        SetProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Eduin ", productos);
        ClienteProducto cliente2 = new ClienteProducto("Wilson ", productos);

        long inicialTime = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Lida");
        CajeraProducto cajera2 = new CajeraProducto("Cristina");

        cajera1.procesarCompra(cliente1, inicialTime);
        cajera2.procesarCompra(cliente2, inicialTime);

    }

    private static void SetProductos(List<Producto> productos) {

        Producto producto1 = new Producto("Aceite", 15, 4);
        Producto producto2 = new Producto("Harina Pan", 20, 3);
        Producto producto3 = new Producto("Queso", 7, 5);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
