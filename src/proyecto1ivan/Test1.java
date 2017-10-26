/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1ivan;

/**
 *
 * @author sala306
 */
public class Test1 
{
    
    
    public static void main(String[] args)
    {
        int numero;//Declaracion de variable tipo entero
        double numero2;//Declaracion variable tipo double
        String name;//Aqui guardaremos texto
        float decimal;//Declaracion variable tipo decimal
        boolean respuesta = true;//Declaracion e inicializacion
        
        numero=60;//Acabo de inicializar la variable numero
        numero2=3.1564564654;//Inicializo la variable numero2
        name="Iván Estrada";//Asigno un valor variable name
        decimal=3.15f;//Agrego literal f para evitar perdida de precision
        
        //En este bloque vamos a usar las variables
        System.out.println("Suma de numero y numero2: "+(numero+numero2));
        System.out.println("Bienvenido \t"+name);         
    }
    
}
