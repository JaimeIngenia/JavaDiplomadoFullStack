package RutaN;
import javax.swing.JOptionPane;
public class mayorNivel {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int suma = 0;
    int resta = 0;
    int producto = 0;
    int division = 0;
    //Metodos
    public void solicitar(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n2: "));
    }
    public void condicional(){
        if (n1>n2){
            suma = n1 + n2;
            System.out.println("La suma es:" + suma );
        }else{
            resta = n2 - n1;
            System.out.println("La resta es:" + resta );
        }
    }
    public void producto(){
        producto = n1 * n2;
        System.out.println("El producto es:" + producto );
    }
    public void dividir(){
        division = n1 / n2;
        System.out.println("La division es:" + division );
    }
}
