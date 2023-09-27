import individuo.*;
import Vehiculo.*;
public class App {
    public static void main(String[] args) throws Exception {
        Persona p= new Persona("Ana", "Almeria", 1972);
        Vehiculo v= new Vehiculo("Renault", 2008, 238943, 15000);
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Ciudad: " + p.ciudad);
        System.out.println("Edad: " + p.obtenerFecha(2023) + "años");
        System.out.println("-------------------------");
        System.out.println("Marca: "+ v.marca);
        System.out.println("Modelo: "+ v.modelo);
        System.out.println("Kilometros: "+ v.kilometros);
        System.out.println("Precio: "+ v.precio);
    }
}
