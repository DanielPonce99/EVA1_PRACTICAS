/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Elias Yañez Ponce 18550346
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArray[] = new int[50];
        int  Menor=100, Mayor=0;
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int)(Math.random()*100+1);
        }
        for (int i : aiArray) {
            System.out.print("["+i+"]");
            if(i>Mayor){
                Mayor = i;
            }
            else if(i<Menor){
                Menor=i;
            }
        }
        System.out.println("");
        System.out.println("Valor menor: "+Menor);
        System.out.println("Valor mayor: "+Mayor);
    }
    
}
