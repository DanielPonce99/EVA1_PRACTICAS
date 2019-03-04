/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N
 */
public class Principal {

    
    public static void main(String[] args) {
        
        int[] arreglo = new int[100];
        int c_pares=0;
        int c_impares=0;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100+1);
            
            if(arreglo[i]% 2==0){
                c_pares++;
            }
            else{
                c_impares++;
            }
    }
    
        int[] par = new int[c_pares];
        int[] impar = new int[c_impares];
        
        c_pares=0;
        c_impares=0;
        //almacenamos los numeros pares e impares en sus arreglos correspondientes
        for (int i = 0; i < 100; i++) {
            if(arreglo[i]% 2==0){
                par[c_pares] = arreglo[i];
                c_pares++;
            }
            else{
                impar[c_impares] = arreglo[i];
                c_impares++;
            }
        }
        
        System.out.println("Pares: ");
        for (int i = 0; i <c_pares; i++) {
            System.out.print("["+ par[i]+ "]");
        }
        System.out.println("");
        
        System.out.println("Impares: ");
        for (int i = 0; i <c_impares; i++) {
            System.out.print("["+ impar[i]+ "]");
        }
        System.out.println("");
}}
