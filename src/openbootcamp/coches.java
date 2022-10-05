
package openbootcamp;

public class coches {
    
    
    public static void main(String[] args) {
        
        coches miCoche = new coches();
        int numeroPuertas = miCoche.puertas(4);
        //Mostrar el número de puertas que tiene el objeto miCoche.
        System.out.println("El numero de puertas del coche es " + numeroPuertas);
        
        //Llamo a la funcion sumar e imprimo por consola la suma de los tres numeros
        System.out.println("La suma de los numeros enviados como parametro a la funcion es " + sumar(4, 5, 6));
    }
    
    //Funcion con tres parámetros que sean números que se suman entre sí.
     public static int sumar(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }
     
    //Una función que incremente el número de puertas que tiene el coche.
    public static int puertas(int puerta){
        int cantidadPuertas = puerta;
        return cantidadPuertas;
    }
}
