package bridge;

public abstract  class TipoNotificacion {
    protected CanalEnvio canalEnvio;
    protected String content;
    public TipoNotificacion(CanalEnvio canalEnvio, String content){
        this.content=content;
        this.canalEnvio=canalEnvio;
    }
    public abstract void enviarNotificacion();
}
