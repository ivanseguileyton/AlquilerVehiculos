package alquilervehiculos;


public class Coche extends Transporte{
    
    private boolean fumable;
    private String categoria;
            
    public Coche(String matricula, int plazas, boolean fumable, String categoria){
        super(matricula, plazas);
        this.categoria = categoria;
    }
    
    @Override
    public double calcularAlquiler(int dias){
        double precio = super.calcularAlquiler(dias);
        
        if(fumable){
            precio = precio + 50;
        }
        
        switch(categoria){
            case "A": precio = precio + 40*dias; break;
            case "B": precio = precio + 30*dias; break;
            case "C": precio = precio + 20*dias; break;
        }
        
        return precio;
    }
    
    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                ", plazas = " +plazas+
                "}" +System.lineSeparator();
    }
    
}
