import Adapter.Impresora;
import Adapter.ImpresoraAdapter;
import Adapter.ImpresoraPDF;
import bridge.*;
import composite.ElementoMenu;
import composite.Menu;
import composite.Plato;
import decorator.*;
import facade.*;
import flyweight.Arbol;
import flyweight.FabricaDeArboles;
import proxy.Archivo;
import proxy.ArchivoProxy;
import proxy.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //ADAPTER
        System.out.println("-------ADAPTER-------");
        //se usa IMpresoraAdapter para imprimir otross tipos de archivo spermitidos
        ImpresoraPDF impreso = new ImpresoraPDF();

        impreso.imprimir("pdf", "economia.pdf");
        impreso.imprimir("txt","PyE.txt");
        impreso.imprimir("word", "cumpleAle.word");
        impreso.imprimir("mp3","audio.mp3");

        System.out.println("-------BRIDGE-------");
        // Se usa la clase abstracta TipoNotificacion para los distintos tipos
        // que implementan la interfaz CanalEnvio con sus metodos
        CanalEnvio email = new Email();
        CanalEnvio sms= new SMS();

        TipoNotificacion AlertaEmail = new Alerta(email,"detectamos un inicio de sesion");
        TipoNotificacion PromocionSms = new Promocion(sms,"10% en mercado libre");
        TipoNotificacion RecordadorioEmail = new Recordatorio(email,"turno medico a las 20hs");

        PromocionSms.enviarNotificacion();
        AlertaEmail.enviarNotificacion();
        RecordadorioEmail.enviarNotificacion();

        System.out.println("-------DECORATOR-------");

        System.out.println("suscripcion 1");
        Plan plan1 = new PlanBasico();
        System.out.println(plan1.descripcion() + "= " + plan1.costo());
        plan1 = new ConHD(plan1);
        System.out.println(plan1.descripcion() + "=" + plan1.costo());
        plan1 = new ConDescargasOff(plan1);
        System.out.println(plan1.descripcion() + "=" + plan1.costo());

        System.out.println("suscripcion 2 ");
        Plan plan2 = new PlanBasico();
        System.out.println(plan2.descripcion() + "" + plan2.costo());
        plan2 = new ConUltraHD(plan2);
        System.out.println(plan2.descripcion() + "="+ plan2.costo());

        System.out.println("-------FACADE-------");
        // se usa tiendaFacade para ocultar el prodecimiento q involucra la compra
        // y solo usar la funcion compra()
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();
        TiendaFacade tiendaFacade = new TiendaFacade(carrito,pago,envio);

        Producto p1 = new Producto(100,"leche");
        Producto p2 = new Producto(200,"harina");

        tiendaFacade.comprar(p1,"taboada");
        tiendaFacade.comprar(p2,"calle chile");

        System.out.println("-------FLYWEIGHT-------");
        // voy a tener claseInterfaz, claseCONCRETA implements a claseINTERFAZ, fabrcaCLASE

        // Se crea solo un objeto del tipo de arbol que necesitamos y luego se usa el mismo objeto
        System.out.println("\n--- FLYWEIGHT ---");
        FabricaDeArboles fabrica = new FabricaDeArboles();

        String[] tipos = {"Roble","Pino","Abedul","Cerezo"};
        String textura = "pinchoso";
        String color = "marron";
        int x = 1;

        for (int i = 0; i < 25; i++){ // cambiar a 1.000.000 como dice el TP, pero la consola no muestra todos
            for (String tipo : tipos) {
                Arbol arbol = fabrica.obtenerArbol(tipo, textura, color);
                arbol.mostrar(x++,50);
            }
        }
        System.out.println("-------PROXY-------");
        // Se usa ArchivoProxy para evaluar si es accesible dependiendo del tipo de acceso que tiene el usuario

        Usuario u1 = new Usuario("Ale", true);
        Usuario u2 = new Usuario("leo", false);

        Archivo secretfile = new ArchivoProxy("receta secreta", "sal y pimi");
        secretfile.abrir(u1);
        secretfile.abrir(u2);

        System.out.println("-------COMPOSITE-------");

        ElementoMenu plato1 = new Plato("tortilla",100);
        ElementoMenu plato2 = new Plato("carne con pps",200);

        Menu menu1 = new Menu("dia");
        menu1.agregarElemento(plato1);

        Menu menu2= new Menu("noche");
        menu2.agregarElemento(plato2);

        menu2.mostrar();
        menu1.mostrar();













    }
}