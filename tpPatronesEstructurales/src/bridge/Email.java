package bridge;

public class Email implements CanalEnvio{
    @Override
    public String enviar() {
        return " Email";
    }
}
