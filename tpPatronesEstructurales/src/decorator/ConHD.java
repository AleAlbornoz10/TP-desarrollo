package decorator;

public class ConHD extends PlanDecorator {
    public  ConHD(Plan plan){
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + HD";
    }

    @Override
    public double costo() {
        return plan.costo() + 500 ;
    }
}
