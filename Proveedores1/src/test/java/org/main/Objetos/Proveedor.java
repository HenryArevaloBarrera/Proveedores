package org.main.Objetos;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoProveedor;

}
