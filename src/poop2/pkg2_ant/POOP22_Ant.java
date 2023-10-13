/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2.pkg2_ant;



/**
 * Permite utilizar la clase Scanner para la lectura de
 * datos de entrada del usuario
 */
import java.util.Scanner;

/**
 *Declaración de la clase principal del código
 * @author Franco Ramirez Christian
 */
public class POOP22_Ant{
    
    /**
     * Establece las variables necesarias y presenta 
     * el menú al usuario de las distintas operaciones
     * @param args 
     */
    public static void main(String[] args){
        float area;
        int opcion;
        final float PI = 3.14159f;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Elige la opción:");
            System.out.println("1.-Area de círculo:");
            System.out.println("2.-Area de triángulo:");
            System.out.println("3.-Area de cuadrado:");
            System.out.println("4.-Salir:");
            opcion = sc.nextInt();
            
            /**
             * Toma como argumento la variable 'opcion'
             */
            switch(opcion){
                /**
                 * Cálcula el area del circulo
                 */
            case 1:
                //Circulo
                System.out.println("Seleccionó el círculo");
                float radio = 15;
                area = PI * radio * radio;
                break;
                /**
                 * Cálcula el área del triángulo
                 */
            case 2:
                //Tríangulo
                System.out.println("Seleccionó el Tríangulo");
                float base = 8, altura = 5;
                area = (base * altura) / 2;
                break;
                
                /**
                 * Cálcula el área del cuadrado
                 */
             case 3:
                //Caudrado
                System.out.println("Seleccionó el Cuadrado");
                float lado = 10;
                area = lado * lado;
                break;
                   /**
                    * Opción para salir del programa
                    */
             case 4:
                //Salir
                System.out.println("Hasta luego");
                continue;
             default:
                 /**
                  * Imprime mensaje cuando no coincide con ninguno de 
                  * casos anteriores
                  */
                 System.out.println("Su selecion no es correcta");
                 continue;
                   
            }
            /**
             * Imprime la respuesta del cálculo del área de la 
             * figura seleccionada
             */
            System.out.println("El area es: " + area);
        
        /**
         * Se ejecuta en un bucle hasta que el usuario desee salir
         */
        }while(opcion !=4);
        sc.close();
    }
}

