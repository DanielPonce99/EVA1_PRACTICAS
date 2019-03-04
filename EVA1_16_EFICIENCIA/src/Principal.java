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
        //System.out.println(Integer.MAX_VALUE);
        int[] aiDatos = new int[2147483647];
        
        for(int i = 0; i < aiDatos.length; i++){
            for(int j= 0; j < aiDatos.length; j++)
                
            
            aiDatos[j] = (int)(Math.random() * 100 + 1);
        }
        
    }
    
}


