package RutaN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class numerosCantidad {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    //Metodos
    public void tresNumerosPedir ()throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un número: ");
        n1 = Integer.parseInt(entrada.readLine());
    }
    public void calcula(){
        if(n1 >= 0 && n1 < 10){
            System.out.println("El numero tiene una cifra.");
        }else if(n1 > 10 && n1 < 100){
            System.out.println("El numero tiene dos cifras.");
        }else if(n1 > 99 && n1 < 1000){
            System.out.println("El numero tiene tres cifras");
        }else if(n1 < 0){
            System.out.println("No se aceptan numeros negativos");
        }
        else{
            System.out.println("El numero de cifras es mayor");
        }

    }
}
