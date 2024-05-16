package org.main.Entidades;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter


public class DetalleVenta implements Serializable {
    private static final long serialVersionUID = 2222;
    private int idDetalleVenta;
    private int idVenta;
    private int idProducto;
    private int cantidad;
    private double precioTotal;



    @Override
    public String toString() {
        return "DetalleVenta{" +
                "idDetalleVenta=" + idDetalleVenta +
                ", idVenta=" + idVenta +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", precioTotal=" + precioTotal +
                '}';
    }

    public DetalleVenta(double precioTotal, int cantidad, int idProducto, int idVenta, int idDetalleVenta) {
        this.precioTotal = precioTotal;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.idVenta = idVenta;
        this.idDetalleVenta = idDetalleVenta;
    }
}
