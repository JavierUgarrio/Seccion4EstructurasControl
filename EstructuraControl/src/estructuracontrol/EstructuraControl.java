/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuracontrol;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EstructuraControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Condiciones
        if(true){
            System.out.println("Se cumple la condicion");
        }
        
        if(false){
            System.out.println("Se cumple la condicion");
        }else{
            System.out.println("No se cumple la condicion");
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        
        int numero = teclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
        System.out.println("Ingrese un numero entero");
        int numero2 = teclado.nextInt();
        
        if(numero2 % 2 !=0){
            if(numero2 % 2 ==0){
                System.out.println("el numero es par");
            }else{
                System.out.println("el numero es impar");
            }
        }else{
            System.out.println("el numero ingresado es neutro");
        }
        
        //* detectar si es vocal o no
        System.out.println("Introduce una letra");
        Scanner tecladoLetra = new Scanner(System.in);
        String letra = tecladoLetra.nextLine();
        
        
        if ( "a".equals(letra) || "A".equals(letra)){
            System.out.println("se trata de una vocal");
        }else if("e".equals(letra) || "E".equals(letra) ){
            System.out.println("se trata de una vocal");
        }else if("i".equals(letra) || "I".equals(letra) ){
            System.out.println("se trata de una vocal");
        }else if("o".equals(letra) || "O".equals(letra) ){
            System.out.println("se trata de una vocal");
        }else if("u".equals(letra) || "U".equals(letra) ){
            System.out.println("se trata de una vocal");
        }else{
            System.out.println("se trata de una consonante");
        }

    /*
        Enunciado: Dado dos números enteros diferentes, devolver el número Mayor.
        Análisis: Para la solución de este problema, se requiere que el usuario ingrese dos números enteros diferentes y el sistema realice el proceso para devolver el número mayor.

        Expresión

        Si  n1>n2 ==>n1 es Mayor
        Si n2>n1 ==>n2 es Mayor

        Entrada
        Dos números (n1 y n2).

        Salida
        Número Mayor (m).

        Preguntas de esta tarea
        Dado dos números enteros diferentes, devolver el número Mayor.
    */
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero");
        int numero0 = teclado2.nextInt();
        
        System.out.println("Por favor, introduce un numero");
        int numero1 = teclado2.nextInt();
  
        if(numero0>numero1){
            System.out.println("El primer numero introducido " + numero0 + " es mayor que " + numero1 );
        }else if(numero1>numero0){
            System.out.println("El segundo numero introducido " + numero1 + " es mayor que " + numero0 );
        }else{
            System.out.println("Son iguales");
        }
        
        /*
        Enunciado: Determine si un número es múltiplo de 3 y 5.
        Análisis: Para la solución de este problema, se requiere que el usuario ingrese un número entero n, luego el sistema analiza y determina si es el número es múltiplo de 3 y de 5.

        Expresión
        Si n Mod 3 = 0 ^ Mod 5 = 0 ==>
            SI ES MÚLTIPLO DE 3 Y 5 
        SINO
            NO ES MÚLTIPLO DE 3 Y 5 
        Entrada
        Número (n)

        Salida
        Resultado (r)
        ES MÚLTIPLO
        NO ES MÚLTIPLO

        Preguntas de esta tarea
        Determine si un número es múltiplo de 3 y 5.
        */    
        
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Por favor, introduce el numero");
        int multiplo = teclado3.nextInt();
        int multiplo1 = 3;
        int multiplo2 = 5;
        
        if(multiplo % multiplo1 == 0){
            System.out.println("Es multiplo de 3");
        }else if(multiplo % multiplo2 ==0){
            System.out.println("Es multiplo de 5");
        }else{
            System.out.println("no es multiplo ni de 3, ni de 5");
        }
        
        
        // SWITCH
        
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7 para elegir el dia de la semana");
        int numeroSemana = teclado4.nextInt();
        String nombreDia = null;
        
        switch(numeroSemana){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("Te has equivocado");
                break;
        }
        System.out.println("el dia de la semana es: "+ nombreDia);
        
        
        /*
        Ejercicio 
        Enunciado: Al ingresar un número entre 1 y 4 devolver la estación del año de acuerdo a la siguiente tabla.
            | Número  | Estación  |
            | :-----: | :-------- |
            |    1    | Verano    |
            |    2    | Otoño     |
            |    3    | Invierno  |
            |    4    | Primavera |
        */
        
        Scanner teclado5 = new Scanner(System.in);
        System.out.println("Introduce un numero entre el 1 y el 4");
        int numeroEstacion = teclado5.nextInt();
        
        String estacion = null;
        
        switch(numeroEstacion){
        case 1:
            estacion = "Verano";
            break;
        case 2:
            estacion = "Otoño";
            break;
        case 3:
            estacion = "Invierno";
            break;
        case 4:
            estacion = "Primavera";
            break;
        default:
            System.out.println("Te has equivocado introduciendo el numero, prueba otra vez");
        }
        System.out.println("la estacion de verano selecionada es: " + estacion); 
        
        //while
        int c =0;
        while(c<=10){
            System.out.println("el valor de c es: " + c);
            c++;
        }
        
        //Ejemplo de la tabla de multiplicar
        
        Scanner teclado6 = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero para mostrar la tabla de multiplicar");
        int n1 = teclado6.nextInt();
        int n2 = 0;
        while (n2 <=10){
            int multiplicacion = n1 *n2;
            System.out.println(n1 + " X "+ n2 +" = " + multiplicacion);
            n2++;
        }
        
        System.out.println("------------------------------------------------------------------------");
       
        // DO WHILE
        int num8 = 0;
        do{
            System.out.println("el valor de c es: " + num8);
            num8++;
        }while( num8 <=10);
    }
    
}
