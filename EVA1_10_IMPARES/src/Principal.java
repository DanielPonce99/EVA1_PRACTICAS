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
        int[] arreglo = new int[100];
        int pares=0;
        int impares=0;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100+1);
            
            if(arreglo[i]% 2==0){
                pares++;
            }
            else{
                impares++;
            }
    }
    
        int[] par = new int[pares];
        int[] impar = new int[impares];
        
        pares=0;
        impares=0;
        
        for (int i = 0; i < 100; i++) {
            if(arreglo[i]% 2==0){
                par[pares] = arreglo[i];
                pares++;
            }
            else{
                impar[impares] = arreglo[i];
                impares++;
            }
        }
        
        System.out.println("Pares: ");
        for (int i = 0; i <pares; i++) {
            System.out.print("["+ par[i]+ "]");
        }
        System.out.println("");
        
        System.out.println("Impares: ");
        for (int i = 0; i <impares; i++) {
            System.out.print("["+ impar[i]+ "]");
        }
        System.out.println("");
    }
    
}
