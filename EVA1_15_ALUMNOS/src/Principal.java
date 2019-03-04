
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        Scanner sNum = new Scanner(System.in);
        
        int matriz[][], nFilas, nCol;
        Alumno[][] apDatos = new Alumno[0][];
    
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el número de grupos"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de alumnos"));
        String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del alumno:");
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la edad del alumno: ");
        for(int i=0; i< nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = sNum.nextInt();
                
            }
        }
        System.out.println("\nEl nombre y la edad es: ");
        for(int i = 0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println(nombre + " " + matriz[i][j]);
            }
            
            System.out.println("");
        }
        
    }
    
class Alumno{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    
public Alumno(){
    nombre = "Daniel";
    apellido = "Yañez";
    edad = 19;
    carrera = "Sistemas";
}   

        public Alumno(String nombre, String apellido, int edad, String carrera) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad; 
            this.carrera = carrera;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getNumControl() {
            return edad;
        }

        public void setNumControl(int numControl) {
            this.edad = numControl;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

}
}

