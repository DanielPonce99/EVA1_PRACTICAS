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
        recursiva();
        System.out.println("Fin main");
    }
   
    public static void recursiva(){
        recursiva();
    }
}
