package RutaN;

import javax.swing.JOptionPane;


public class NombreSexoPeso {
    //Atributos
    String nombre = "";
    String sexo = "";
    int peso = 0;
    //Métodos
    public void PedirNombre(){
        nombre = String.valueOf(JOptionPane.showInputDialog("Ingrese su nombre: "));
        sexo = String.valueOf(JOptionPane.showInputDialog("Ingrese su sexo: "));
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso: "));

        //n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 1: "));
       
        
    }
    public void MostrarHermano(){
        System.out.println("Mira aquí abajo humano");
        System.out.println(nombre);
        System.out.println(sexo);
        System.out.println(peso);
    }
}