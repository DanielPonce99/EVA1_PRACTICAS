
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
        // TODO code application logic here
    
     Scanner sCaptu = new Scanner(System.in);
       Scanner sCaptu2 = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int Num = sCaptu.nextInt();
        int Num2 = sCaptu.nextInt();
        sCaptu.nextLine();
        
        recursivo(Num, Num2);
        
    }
    
    public static void recursivo(int iVal, int Total){
        int resu = 0;
        resu=iVal;
        while(iVal!=0){
            Total = Total + iVal%10;
            iVal = iVal/10;
            
            System.out.println(resu);
            
        }
    }

}
    
    
    

