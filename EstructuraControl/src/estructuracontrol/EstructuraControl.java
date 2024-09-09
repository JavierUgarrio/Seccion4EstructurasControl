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
        
    }
    
}
