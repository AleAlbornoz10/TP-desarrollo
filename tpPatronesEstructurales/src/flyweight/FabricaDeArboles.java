package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private Map<String,Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol (String textura, String tipo, String color){

        Arbol arbol = arboles.get(tipo+textura+color);
        if( arbol == null){
            arbol = new ArbolConcreto(textura,tipo,color);
            arboles.put(tipo+textura+color,arbol);
        }
        return arbol;
    }
}
