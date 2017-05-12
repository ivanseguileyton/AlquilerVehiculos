package alquilervehiculos;

public abstract class Transporte extends Vehiculo{
    
    protected int plazas;
    
    public Transporte(String matricula, int plazas){
        super(matricula);
        this.plazas = plazas;
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double base = super.calcularAlquiler(dias);
        return base + 1.5*dias + 1.5*plazas;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", plazas = " +plazas+
                "}" +System.lineSeparator();
    }
    
}
