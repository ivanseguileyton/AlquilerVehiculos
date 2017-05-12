package alquilervehiculos;

public class Camion extends Carga{
    
    public Camion(String matricula, double PMA){
        super(matricula, PMA);
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double precioBase = super.calcularAlquiler(dias);
        return precioBase + 40;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", PMA = " +PMA+
                "}" +System.lineSeparator();
    }
    
}
