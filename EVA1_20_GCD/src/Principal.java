
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
        Scanner sCaptu2 = new Scanner(System.in);
        
        System.out.println("Ingrese dos valores");
        int iNum = sCaptu.nextInt();
        int iNum2 = sCaptu2.nextInt();
       
        
        sCaptu.nextLine();
        
        if(iNum > iNum2){
            int residuo = iNum/iNum2;
        System.out.println("Máximo común divisor :" + residuo);
        }
        else{
            int residuo2 = iNum2/iNum;
        }
        
        
        }
    }
    
    
        
        
    

