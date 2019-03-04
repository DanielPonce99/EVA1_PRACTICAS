
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
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        //for( int i = iNum; i>= 1; i--){
        //System.out.print(i + " - ");
    //}
    recursiveDown(iNum);
    
    recursiveUp(iNum, 1);
    }
    public static void recursiveDown(int iVal){
        /*DOS CARACTERÍSTICAS:
        1.- LLAMADA RECURSIVA: El método debe llamarse a sí mismo
        2.- DETENERSE: El método debe proporcionar maneras para detener la recursión
        */
        System.out.print(iVal);
        
        if(iVal > 1){
            System.out.print(" - ");
           recursiveDown(iVal - 1);
        }
        
       
        
        
    }

    public static void recursiveUp(int iVal, int iCont){
        
        System.out.print(iCont);
        if(iCont < iVal){
            System.out.print(" - ");
            recursiveUp(iVal, iCont + 1);
        }
    }
}
