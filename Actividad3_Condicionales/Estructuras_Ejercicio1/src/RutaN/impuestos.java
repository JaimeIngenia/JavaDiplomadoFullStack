
package RutaN;

public class impuestos {
    //Atributos 

    int salario = 8000;

    //Metodos

    public void calcular(){
        if (salario>3000){
            System.out.println("Usted debe abonar impuestos");
        }else{
            System.out.println("Usted NO debe abonar impuestos");
        }
    }
}
