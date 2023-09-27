public class Persona {
    public int fnac =2000;
    public String nombre;
    public String ciudad;

    public Persona(String nom, String ciu, int fecha){
        // método constructor ... p = new Persona ('Ana', 'Almeria', 2010)
    
        this.nombre = nom;
        this.ciudad = ciu;
        this.fnac = fecha;
    }
    // método get/set getters/setters

    // métodos que operan sobre atributos para realizar cálculos
        public int obtenerFecha(int anioAct) {
            int edad = 0;
            edad = anioAct - this.fnac;
            return edad;

        }
        //método main --> comienza la clase

        public static void main(String[] args){

            Persona p= new Persona("Ana", "Almeria", 1972);
            System.out.println(p.nombre);
            System.out.println(p.ciudad);
            System.out.println(p.fnac);
        }

    }