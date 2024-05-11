package org.main.Objetos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
}
