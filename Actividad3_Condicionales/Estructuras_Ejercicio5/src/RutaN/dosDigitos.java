
package RutaN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dosDigitos {
    public static void main(String[] args) throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double numero;
        System.out.print("Ingrese un número: ");
        numero = Double.parseDouble(entrada.readLine());
        if(numero < 10){
            System.out.println("El numero tiene un dígito.");
        }else if(numero > 10 && numero < 100){
            System.out.println("El numero tiene dos digitos.");
        }
    }}
