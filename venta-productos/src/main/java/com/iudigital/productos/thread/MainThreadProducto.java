package com.iudigital.productos.thread;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class MainThreadProducto {
    
    public static void main(String[] args){
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Juan", productos);
        ClienteProducto cliente2 = new ClienteProducto("Tomas", productos);
        
        long initialTime = System.currentTimeMillis();
        
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Patricia ", cliente1, initialTime);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Carmen ", cliente2, initialTime);
        
        cajera1.start();
        cajera2.start();                
    }
    
    private static void setProductos(List<Producto> productos){
        Producto p1 = new Producto("Manzana", 75, 3);
        Producto p2 = new Producto("Pera", 85, 5);
        Producto p3 = new Producto("Papaya", 60, 2);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }
    
}
