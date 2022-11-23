
package RutaN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class validar {
    //Atributos
    int n1 = 0;
    //Metodos
    public void pedirDatos()throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un número: ");
        n1 = Integer.parseInt(entrada.readLine());
    }
    public void calcula(){
        if(n1>0){
            System.out.println("Positivo");
        }else if(n1<0){
            System.out.println("Negativo");
        }else if (n1==0){
            System.out.println("Nulo");
        }
    }
}
