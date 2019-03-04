
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
        Scanner sCaptu1 = new Scanner(System.in);
        System.out.println("Ingrese una base");
        int base = sCaptu1.nextInt();
       
        System.out.println("Ingrese una potencia");
        int exponente = sCaptu1.nextInt();
        
        System.out.println("Resultado: " + potencia(base, exponente));
    }
    
    public static double potencia(int base, int exponente){
        
        if(exponente == 0){
            return 1;
        }
        else if (exponente == 1){
            return base;
        }
        else if (exponente < 0){
            return potencia(base, exponente+1)/base;
            
        }
        else {
            return base*potencia(base, exponente-1);
        }
    }
}
