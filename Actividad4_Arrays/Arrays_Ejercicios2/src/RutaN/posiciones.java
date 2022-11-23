
package RutaN;
import java.util.Random;

public class posiciones {
    //Atributos
    int[] vector = new int[16];
    Random random = new Random(); 
    //Metodos
    public void ejecución(){
        for (int i = 0; i < 15; i++) {
        vector[i] = (random.nextInt(100000) % 100);
        System.out.printf("%d ",vector[i]);
        }
    }
 
}
