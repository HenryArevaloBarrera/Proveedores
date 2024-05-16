package org.main.Entidades;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter

public class Producto implements Serializable {
    private static final long serialVersionUID = 2222;
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int idProveedor;
    private int idTipoProducto;
    private int stock;

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", idProveedor=" + idProveedor +
                ", idTipoProducto=" + idTipoProducto +
                ", stock=" + stock +
                '}';
    }

    public Producto(int idProducto, String stock, String idTipoProducto, double precio, int descripcion, int nombre, int idProveedor) {
        this.idProducto = idProducto;
        this.stock = Integer.parseInt(stock);
        this.idTipoProducto = Integer.parseInt(idTipoProducto);
        this.precio = precio;
        this.descripcion = String.valueOf(descripcion);
        this.nombre = String.valueOf(nombre);
        this.idProveedor = idProveedor;
    }
}
