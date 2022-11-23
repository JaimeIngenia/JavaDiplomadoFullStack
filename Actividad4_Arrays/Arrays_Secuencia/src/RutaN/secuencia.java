
package RutaN;
import java.util.Scanner;

public class secuencia {
    public static void main(String[] args) {
        int [] vector = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            vector[i] = entrada.nextInt();
        }
        System.out.print("El vector inverso es: [");
        for (int i = (vector.length-1); i >= 0; i--) {
            System.out.printf(" %d  ",vector[i]);   
        }
        System.out.println("]");
    } 
}