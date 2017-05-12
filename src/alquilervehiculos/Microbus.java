package alquilervehiculos;

public class Microbus extends Transporte{
    
    public Microbus(String matricula, int plazas){
        super(matricula, plazas);
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double cambio = super.calcularAlquiler(dias);
        return cambio + 2*plazas;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", plazas = " +plazas+
                "}" +System.lineSeparator();
    }
    
}
