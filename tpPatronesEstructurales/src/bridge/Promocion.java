package bridge;

public class Promocion extends TipoNotificacion {
    public Promocion(CanalEnvio canalEnvio, String content){
        super(canalEnvio,content);
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("enviando una promocion "+ " " + content + "" +canalEnvio.enviar());
    }
}
