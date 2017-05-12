package alquilervehiculos;

public class Furgoneta extends Carga{
    
    private boolean isotermo;
    
    public Furgoneta(String matricula, double PMA, boolean isotermo){
        super(matricula, PMA);
        this.isotermo = isotermo;
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double precio = super.calcularAlquiler(dias);
        
        if(isotermo){
            precio = precio + 200;
        }
        
        return precio; 
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", PMA = " +PMA+
                "}" +System.lineSeparator();
    }
    
}
