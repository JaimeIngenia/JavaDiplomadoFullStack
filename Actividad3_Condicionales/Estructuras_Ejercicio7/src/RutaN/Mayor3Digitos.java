
package RutaN;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mayor3Digitos {
    //Atributos
    double n1 = 0;
    int n2 = 0;
    int n3 = 0;
    //Métodos
    public void calcula()throws IOException{
    
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un número: ");
        n1 = Double.parseDouble(entrada.readLine());
        System.out.print(n1);
    }
    
}
