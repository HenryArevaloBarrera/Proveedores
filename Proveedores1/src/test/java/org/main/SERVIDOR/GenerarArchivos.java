package org.main.SERVIDOR;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.main.Entidades.*;

public class GenerarArchivos {
    /**
     * Genera un archivo CSV a partir de una lista de ventas.
     *
     * @param ventas Lista de ventas a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVVenta(List<Venta> ventas, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            for (Venta venta : ventas) {
                writer.append(String.valueOf(venta.getIdVenta()))
                        .append(',')
                        .append(dateFormat.format(venta.getFechaVenta()))
                        .append(',')
                        .append(String.valueOf(venta.getIdCliente()))
                        .append(',')
                        .append(String.valueOf(venta.getTotal()))
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }

    /**
     * Genera un archivo CSV a partir de una lista de tipos de productos.
     *
     * @param tiposProductos Lista de tipos de productos a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVTipoProducto(List<TipoProducto> tiposProductos, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            for (TipoProducto tipoProducto : tiposProductos) {
                writer.append(String.valueOf(tipoProducto.getIdTipoProducto()))
                        .append(',')
                        .append(tipoProducto.getNombre())
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }

    /**
     * Genera un archivo CSV a partir de una lista de proveedores.
     *
     * @param proveedores Lista de proveedores a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVProveedor(List<Proveedor> proveedores, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            for (Proveedor proveedor : proveedores) {
                writer.append(String.valueOf(proveedor.getIdProveedor()))
                        .append(',')
                        .append(proveedor.getTipoProveedor())
                        .append(',')
                        .append(proveedor.getNombre())
                        .append(',')
                        .append(proveedor.getDireccion())
                        .append(',')
                        .append(proveedor.getTelefono())
                        .append(',')
                        .append(proveedor.getEmail())
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }

    /**
     * Genera un archivo CSV a partir de una lista de productos.
     *
     * @param productos Lista de productos a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVProducto(List<Producto> productos, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            for (Producto producto : productos) {
                writer.append(String.valueOf(producto.getIdProducto()))
                        .append(',')
                        .append(producto.getNombre())
                        .append(',')
                        .append(producto.getDescripcion())
                        .append(',')
                        .append(String.valueOf(producto.getPrecio()))
                        .append(',')
                        .append(String.valueOf(producto.getIdProveedor()))
                        .append(',')
                        .append(String.valueOf(producto.getIdTipoProducto()))
                        .append(',')
                        .append(String.valueOf(producto.getStock()))
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }
    /**
     * Genera un archivo CSV a partir de una lista de detallesVentas.
     *
     * @param detallesVentas Lista de detallesVentas a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVDetalleVenta(List<DetalleVenta> detallesVentas, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            for (DetalleVenta detalleVenta : detallesVentas) {
                writer.append(String.valueOf(detalleVenta.getIdDetalleVenta()))
                        .append(',')
                        .append(String.valueOf(detalleVenta.getIdVenta()))
                        .append(',')
                        .append(String.valueOf(detalleVenta.getIdProducto()))
                        .append(',')
                        .append(String.valueOf(detalleVenta.getCantidad()))
                        .append(',')
                        .append(String.valueOf(detalleVenta.getPrecioTotal()))
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }

    /**
     * Genera un archivo CSV a partir de una lista de clientes.
     *
     * @param clientes Lista de clientes a escribir en el archivo CSV.
     * @param archivoDestino Nombre del archivo CSV de destino.
     * @throws IOException Si ocurre un error de E/S al escribir en el archivo.
     */
    public static void generarCSVCliente(List<Cliente> clientes, String archivoDestino) throws IOException {
        File carpeta = new File("Recursos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, archivoDestino);
        FileWriter fileWriter = new FileWriter(archivo, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            for (Cliente cliente : clientes) {
                writer.append(String.valueOf(cliente.getIdCliente()))
                        .append(',')
                        .append(cliente.getNombre())
                        .append(',')
                        .append(cliente.getDireccion())
                        .append(',')
                        .append(cliente.getTelefono())
                        .append(',')
                        .append(cliente.getEmail())
                        .append('\n');
            }
        } finally {
            writer.close();
        }
    }
}
