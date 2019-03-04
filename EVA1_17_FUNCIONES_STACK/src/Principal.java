/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce 18550346
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia Main");    
    String sCade = "Hola " + cadena();  
        System.out.println(sCade);
        System.out.println("Termina Main");
    }
    
    public static String cadena(){
        System.out.println("Inicia cadena");
        System.out.println("Termina cadena");
        return "Mundo";
    }
}
