package bridge;

public class Alerta extends TipoNotificacion{
    public Alerta (CanalEnvio canalEnvio, String content){
        super(canalEnvio,content);
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando una Alerta" + content +""+ canalEnvio.enviar());
    }
}
