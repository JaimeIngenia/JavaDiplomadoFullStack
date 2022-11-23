package RutaN;
import javax.swing.JOptionPane;
public class alumno {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int suma = 0;
    float promedio = 0;
    //Metodos
    public void pedir(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n3: "));
    }
    public void promedioCondicion(){
        suma = n1 + n2 + n3;
        promedio = suma / 3 ;
        if(promedio>=7){
            System.out.println("El estudiante  ha sido promeiconado");
        }else{
            System.out.println("El estudiante NO ha sido promeiconado");
        }
    }
}
