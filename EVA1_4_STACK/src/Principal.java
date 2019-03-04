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
    System.err.println("Inicio main");
    A();
    }
   
    public static void A(){
     System.out.println("Inicio A");
     System.out.println("Fin A");
    }
    public static void B(){
     System.out.println("Inicio B");
     C();
     System.out.println("Fin B");
    }

    public static void C(){
        System.out.println("Inicio C");
        
        System.out.println("Fin C");
}
}