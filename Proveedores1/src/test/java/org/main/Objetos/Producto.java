package org.main.Objetos;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int precio;
    private int idProveedor;
    private int idTipoProducto;
    private int stock;

}
