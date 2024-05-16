package org.main.Entidades;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter

public class Cliente implements Serializable {
    private static final long serialVersionUID = 2222;

    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String email) {
        super();
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
