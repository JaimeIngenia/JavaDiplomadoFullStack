package RutaN;
import javax.swing.JOptionPane;
public class mayor {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int mayor = 0;
    //Metodos
    public void mayor(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n2: "));

        if(n1>n2){
            mayor = n1;
        }else{
            mayor = n2;
        }
        System.out.println("El número mayor es : " + mayor);
    }
}
