package decorator;

public class ConUltraHD extends PlanDecorator {
    public ConUltraHD(Plan plan){
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + con ultra HD";
    }

    @Override
    public double costo() {
        return plan.costo() + 1000;
    }

}
