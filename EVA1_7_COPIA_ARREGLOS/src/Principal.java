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
        //LLENAR CON 100 ENTEROS ALEATORIOS
        //IMPRIMIR
        //DIRECCIÓN DE MEMORIA
        //ELEMENTOS EN UNA LÍNEA
        int[] aiDatos = new int[100];

        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(aiDatos);

        for (int aiDato : aiDatos) {
            System.out.print("[" + aiDato + "]");
        }


        /*aiDatos = new int[50];
        System.out.println("");
        System.out.println(aiDatos);
        for (int aiDato : aiDatos){
            System.out.print("[" + aiDato + "]");*/
        
        int[] aiCopia = aiDatos;
        System.out.println("");
        System.out.println("aiDatos = " + aiDatos);
        System.out.println("aiCopia = " + aiCopia);

        aiDatos = new int[50];
        System.out.println("");
        System.out.println(aiDatos);
        System.out.println("\nIMPRIMIENDO DATOS");
        for (int aiDato : aiDatos) {
            System.out.print("[" + aiDato + "]");
        }

        System.out.println("\nIMPRIMIENDO COPIA");
        for (int i : aiCopia) {
            System.out.print("[" + i + "]");
        }

    }

}
