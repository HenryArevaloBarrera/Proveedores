package org.main.Objetos;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Venta {
    private int idVenta;
    private String fechaVenta;
    private int idCliente;
    private double total;

}
