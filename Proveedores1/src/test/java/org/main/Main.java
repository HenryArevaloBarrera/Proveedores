package org.main;


import org.main.Conexion.*;
import org.main.Objetos.*;

public class Main {
    public static void main(String[] args) {

        Venta venta = new Venta();
        DetalleVenta detalleVenta = new DetalleVenta();
        Producto producto = new Producto();
        Cliente cliente = new Cliente();
        Proveedor proveedor = new Proveedor();
        TipoProducto tipoProducto = new TipoProducto();
        Conexion conexion = new Conexion();
        Conexion.main(args);

        
    }
}