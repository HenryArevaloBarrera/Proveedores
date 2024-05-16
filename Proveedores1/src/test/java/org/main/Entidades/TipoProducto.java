package org.main.Entidades;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter


public class TipoProducto implements Serializable {
    private static final long serialVersionUID = 2222;
    private int idTipoProducto;
    private String nombre;

    @Override
    public String toString() {
        return "TipoProducto{" +
                "idTipoProducto=" + idTipoProducto +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public TipoProducto(int idTipoProducto, String nombre) {
        this.idTipoProducto = idTipoProducto;
        this.nombre = nombre;
    }
}
