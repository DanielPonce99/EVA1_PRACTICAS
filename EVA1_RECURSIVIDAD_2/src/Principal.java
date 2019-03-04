
import java.util.Scanner;

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
        
        Scanner Pal = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String Palabra = Pal.next();
         Pal.nextLine();
        System.out.println("¿Qué letra desea borrar?");
        int caracter = Pal.nextInt();
       
        
        System.out.println("Nueva palabra: " + quitarX());
    }
    
    public static String quitarX(String letra, String palabra){
        int x = 0;
        int equis = x;
       
        for(int i = 0; i<palabra.length(); i++){
            if(equis-1!=i){
                
            
            letra = letra + letra.charAt(i);
        }
        }
        return letra;
       
        
    }
}
