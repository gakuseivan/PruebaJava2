/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1ivan;
import java.util.Scanner;/*Esta libreria toma los datos que 
                            digita el usuario por consola
                            PASO 1*/


/**
 *
 * @author sala306
 */
public class EntradaDatos {
    
    public static void main(String[] args)
    {
        //Aqui estamos creando el objeto escaner - PASO 2
        //Este objeto solo se crea una vez.
        Scanner sc = new Scanner(System.in);//se crea el lector
        
        //Pedimos los datos al usuario - PASO 3
        System.out.println("Por favor ingrese su nombre");
        
        //Se lee el nombre y se almacena - paso 4 
        String nombre = sc.nextLine();
        
        //Procesamos los datos del usuario, en este caso, lo imprimimos - PASO5
        System.out.println("Bienvenido "+nombre+" Por favor digite la edad");
        
        int edad = sc.nextInt();
        System.out.println("Usted tiene "+edad+" años");
        
        
        
    }
    
}
