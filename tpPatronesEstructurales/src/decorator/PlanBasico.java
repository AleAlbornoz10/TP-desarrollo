package decorator;

public class PlanBasico implements Plan{
    @Override
    public String descripcion() {
        return "Plan Basico";
    }

    @Override
    public double costo() {
        return 1000;
    }
}
