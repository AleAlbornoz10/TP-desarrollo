package proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor@Setter@Getter
public class ArchivoReal implements Archivo {
    //abre y lee un archivo
    //archivo real pesado de crear
        private String nombre;
        private String contenido;

        public void abrir(Usuario... arg) {
            System.out.println("Abriendo "+nombre+"\nContenido: "+contenido);
        }
    }