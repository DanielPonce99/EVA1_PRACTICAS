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

        int aiArreglo[] = new int[100];
        llenar(aiArreglo);
        imprimir(aiArreglo);
        int iVal = 10;
        System.out.println("\niVal = " + iVal);
        incrementa(iVal);
        System.out.println("iVal = " + iVal);
    }

    public static void llenar(int[] aiArre) { 
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int) (Math.random() * 100 + 1);
        }

    }

    public static void imprimir(int[] aiArre) {
        for (int i = 0; i < aiArre.length; i++) {
            System.out.print("[" + aiArre[i] + "]");
        }
    }

    public static void incrementa(int i) {
        i++;
    }
}


