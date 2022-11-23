
package RutaN;

import java.util.Scanner;
import java.util.Arrays;

public class matriz {
    //Atributos
    int x = 0;
    int matriz[][];
    //Metodos
    public void pedir(){
        System.out.println("HolaMundo");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension de la matriz: ");
        x = sc.nextInt();
        matriz = new int[x][x];
    }
    
    public void llenar(){
         //Relleno de matriz automatico
        for (int i=0; i<x; i++){ 
            for (int j=0; j<x; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }

    }
    
    public void imprimirMatriz(){
      //Imprimir matriz original
        System.out.println("Matriz original");
            for (int i=0; i<x; i++){ 
                for (int j=0; j<x; j++){ 
                    System.out.print(matriz[i][j]+" "); 
                }
                System.out.println(); 
            }
        }
    
    public void MayorColumna(){
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[j][i] > mayor ){
                    mayor = matriz[j][i];
                }
            }
            System.out.printf("El mayor en la columna [ %d ] es: %d \n",(i+1),mayor);
            mayor = 0;
        }
    }
    
    public void menorFila(){
        int menor = 10;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
            System.out.printf("El menor en la fila [ %d ] es: %d \n",(i+1),menor);
            menor = 10;
        }

    }
    
    public void descendente(){
        //Matriz ordenada de menor a mayor
        //Matriz ordenada descendentemente en un vector
        //Guardamos la matriz en un vector
        int [] VectorMatriz = new int [x*x];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                VectorMatriz [contador] = matriz[i][j];
                contador++;
            }
        }
        //Ordenamos VectorMatriz
        int temporal;
        for (int i = 0; i < VectorMatriz.length-1; i++) {
            if(VectorMatriz[i+1] > VectorMatriz[i]){
                temporal = VectorMatriz[i];
                VectorMatriz[i] = VectorMatriz[i+1];
                VectorMatriz[i+1] = temporal;
                i = -1;
            }
        }
        //Visualizar VectorMatriz
        System.out.println("Vector Ordenado Descendentemente: ");
        System.out.print("[");
        for (int i = 0; i < VectorMatriz.length; i++) {
            System.out.print(" " + VectorMatriz[i]+"  ");
        }
        System.out.print("]\n");

        }

}
