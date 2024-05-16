package org.main.Entidades;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter


public class Proveedor implements Serializable {
    private static final long serialVersionUID = 2222;
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoProveedor;

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipoProveedor='" + tipoProveedor + '\'' +
                '}';
    }

    public Proveedor(int idProveedor, String tipoProveedor, String nombre, String direccion, String telefono, String email) {
        this.idProveedor = idProveedor;
        this.tipoProveedor = tipoProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
