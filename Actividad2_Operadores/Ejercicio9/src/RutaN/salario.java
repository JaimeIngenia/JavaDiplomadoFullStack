
package RutaN;

public class salario {
    //Atributos
    double salarioIncremento = 0;
    //Metodos
    public void pedir_salario(int x){
        salarioIncremento = (x*0.25)+x;
        System.out.println(salarioIncremento);
    }
}
