package proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Usuario {
 private  String nombreUsuario;
 private boolean accesoAdmin; //true tiene acceso o flase no tiene acceso al archivo

}
