package RutaN;
import javax.swing.JOptionPane;
public class Promedio {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int suma = 0;
    float promedio = 0;
    //Metodos
    public void condicion(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n1: "));      
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n3: "));
        suma = n1+n2+n3;
        promedio = suma / 3; 
        if(promedio>= 7) {
            System.out.println("Promocionado");
        }else if( promedio >= 4 && promedio < 7 ){
            System.out.println("Regular");
        }else if( promedio < 4 ){
            System.out.println("Reprobado");
        }
    }
    
}
