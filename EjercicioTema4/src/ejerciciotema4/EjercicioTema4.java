/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
- Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
- Incrementar el valor de la variable en uno cada vez que se ejecute.
- Mostrarlo por pantalla cada vez que se ejecute.
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la 
variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
package ejerciciotema4;

/**
 *
 * @author victor
 */
public class EjercicioTema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condición:
        System.out.println("Ejercicio If");
        int numeroIf= 123;
        
        if(numeroIf>=0){
            if(numeroIf==0){
                System.out.println("El número es = a 0");
            }
            if(numeroIf>0){
                System.out.println("El número es positivo");
            }    
        } else {
            System.out.println("El número es negativo");
        }
        
        //While:
        System.out.println("Ejercicio While");
        int numeroWhile = 0;
            while (numeroWhile < 3) {
              System.out.println(numeroWhile);
              numeroWhile++;
            }
            
         //Do While
         System.out.println("Ejercicio Do While");
         int i = 3;
            do {
              System.out.println(i);
              i++;
            }
            while (i < 3);
            
         //For loop
         System.out.println("Ejercicio for loop");
         for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
         System.out.println(numeroFor);
         }
         
         //switch case
         System.out.println("Ejercicio for switch case");
         
         String estacion = "verano";
            switch (estacion) {
              case "verano":
                System.out.println("La estación es: verano");
                break;
              case "invierno":
                System.out.println("La estación es: invierno");
                break;
              case "primavera":
                System.out.println("La estación es: primavera");
                break;
              case "otoño":
                System.out.println("La estación es: otoño");
                break;
              default:
                System.out.println("El valor no es una estación del año");
            }
    }
    
}
