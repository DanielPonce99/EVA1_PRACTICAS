
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
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un número");
        int Num = sCaptu.nextInt();
        sCaptu.nextLine();
        
        System.out.println("Resultado: " + sumaDigitos(Num));
        
        
    }
    
    public static int sumaDigitos(int numero){
       
        if(numero < 10){
            return numero;
        }
        else{
            return (numero % 10) + sumaDigitos(numero/10);
        }
    }
}