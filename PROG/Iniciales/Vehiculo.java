public class Vehiculo {
    public String marca;
    public String modelo;
    public int anio;
    public int km;
    public int precio;
    public int garantia;
    }
    public static void main (String [] args) throws Exception{

        Vehiculo v= new Vehiculo(marca:"Renault", modelo:"Logan", anio:2015, km:100000, precio:13000, garantia:4);
        System.out.println(v.marca);
        System.out.println(v.modelo);
        System.out.println(v.anio);
        System.out.println(v.km);
        System.out.println(v.precio);
        System.out.println(v.garantia);
    }

}
