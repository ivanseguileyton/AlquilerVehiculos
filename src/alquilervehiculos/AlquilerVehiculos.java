package alquilervehiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlquilerVehiculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList();
        String matriculasa = "";
        
        
        Coche c1 = new Coche("257869R", 4, true, "A");
        
        Microbus m1 = new Microbus("456789M", 8);
        
        Furgoneta f1 = new Furgoneta("147963H", 50, false);
        
        Camion cc1 = new Camion("159963H", 90);
        
        vehiculos.add(c1);
        vehiculos.add(m1);
        vehiculos.add(f1);
        vehiculos.add(cc1);
        
        System.out.println("Introduce una matricula: ");
            matriculasa = scanner.next();
            
        for(Vehiculo vehiculo : vehiculos){
            
            if(vehiculos.equals(matriculasa)){
                System.out.println(vehiculo.getMatricula());
                System.out.println("El alquiler vale: "+vehiculo.calcularAlquiler(20));
                System.out.println("-------------------");
            }else{
                System.out.println("No existe esa matricula");
            }
            
        }
    }
    
}
