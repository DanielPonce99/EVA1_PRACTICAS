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

    
    public static void main(String[] args) {
     
        Principal pObj = new Principal(); 
        Principal pObj2 = new Principal();
        System.out.println(pObj);
        System.out.println(pObj2);
        
        Principal pCopia = pObj;
        System.out.println(pCopia);
        
        pObj = null;
        pObj2 = null;
        System.out.println(pObj);
        System.out.println(pObj2);
        System.out.println(pCopia);
        
    }
    
}
