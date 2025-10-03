package facade;

public class Pago {
 public void pagar(Producto producto){
     System.out.println("usted esata abonando" + " " + producto.getNombre() + "" + " a " + "" + producto.getPrecio());
 }
}
