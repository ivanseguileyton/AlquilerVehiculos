package alquilervehiculos;

public abstract class Vehiculo {
    
    protected String matricula;
    
    public Vehiculo(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
    public double calcularAlquiler(int dias){
        return 50*dias;
    };

    @Override
    public String toString(){
        return "Vehiculo{" +
                "matricula = " +matricula+
                "}" +System.lineSeparator();
    }

 
    
    
    
}
