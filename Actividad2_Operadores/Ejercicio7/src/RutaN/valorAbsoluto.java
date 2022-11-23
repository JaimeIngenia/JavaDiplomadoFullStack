
package RutaN;

import javax.swing.JOptionPane;

public class valorAbsoluto {
    //Atributos
    int x = 0;
    float resultado = 0;
    
    //Metodos
    
    public void pedir(){
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero: "));
    }
    
    public void valor(){
        if ( x % 2 == 0){
        resultado = x;
        }else{
        x=x*-1;
        resultado = x;
        }
        System.out.println(resultado);
    }
}
