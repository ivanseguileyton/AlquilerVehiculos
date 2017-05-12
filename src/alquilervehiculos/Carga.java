package alquilervehiculos;

public abstract class Carga extends Vehiculo{
    
    protected double PMA;
    
    public Carga(String matricula, double PMA){
        super(matricula);
        this.PMA = PMA;
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double base = super.calcularAlquiler(dias);
        return base + 20*PMA;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", PMA = " +PMA+
                "}" +System.lineSeparator();
    }
    
}
