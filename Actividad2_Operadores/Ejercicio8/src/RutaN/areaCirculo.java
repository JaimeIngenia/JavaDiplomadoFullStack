
package RutaN;

import javax.swing.JOptionPane;


public class areaCirculo {
    //Atributos
    int r=0;
    double area = 0;
    //Metodos
    public void area(){
        r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));
        area = (r*r*3.1415);
        System.out.println("El area del circulo es: " + area);
    }
}
