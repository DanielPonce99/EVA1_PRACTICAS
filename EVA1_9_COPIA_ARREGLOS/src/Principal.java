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
       
       int[] aiArreglo = new int[100];
       llenar(aiArreglo);
       imprimir(aiArreglo);
       System.out.println("");
       //CREAR UNA COPIA
       //int[] aiCopia = aiArreglo; //NO FUNCIONA
       int [] aiCopia = new int[100];
       //leer elemento por elemento y copiar
       for (int i=0; i<aiArreglo.length; i++){
           aiCopia[i] = aiArreglo[i];
    }
       imprimir(aiCopia);
       
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
}
