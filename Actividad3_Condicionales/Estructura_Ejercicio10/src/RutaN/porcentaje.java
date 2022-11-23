
package RutaN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class porcentaje {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    float suma = 0;
    float p1 = 0;
    float p2 = 0;
    //Metodos
    public void pedir()throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese buenas: ");
        n1 = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese malas: ");
        n2 = Integer.parseInt(entrada.readLine());
        System.out.println("Sus numeros son n1: " + n1 +" y n2:"+n2);
    }
    public void calcula(){
        suma = n1+n2;
        p1 = n1*100/suma;
        p2 = n2*100/suma;
        System.out.println("El porcentaje de malas es: " + p2);
        System.out.println("El porcentaje de buenas es: " + p1);
        if (p1 >= 90){
            System.out.println("Nivel Máximo");
        }else if(p1 >= 75 && p1 < 90){
            System.out.println("Nivel Medio");
        }else if(p1 >= 50 && p1 < 75){
            System.out.println("Nivel Regular");
        }else if (p1 < 50){
            System.out.println("Fuera de Nivel");
        }

        
    }
}
