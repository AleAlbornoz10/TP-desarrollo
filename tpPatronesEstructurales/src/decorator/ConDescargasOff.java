package decorator;

public class ConDescargasOff extends PlanDecorator{
    public ConDescargasOff(Plan plan){
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + con descargas offline";
    }

    @Override
    public double costo() {
        return plan.costo() + 700 ;
    }
}
