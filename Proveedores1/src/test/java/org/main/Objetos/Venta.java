package org.main.Objetos;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private int idCliente;
    private double total;

}
