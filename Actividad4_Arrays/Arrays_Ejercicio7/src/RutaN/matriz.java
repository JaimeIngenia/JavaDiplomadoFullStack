
package RutaN;

public class matriz {
    //Atributos
    int n1 = 0;
    //Metodos
    public void a (){
        System.out.println("HolaMundo"+n1);
        int f = 3, c = 4;
        int limite = 10;
        double suma = 0;
        double promedio;
        
        double [][] matriz = new double[f][c];
        
        //rellena la matriz y saca la sumatoria de los elementos
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = Math.round(Math.random()*99);
                if(matriz[i][j] < limite){
                    matriz[i][j] += limite;
                }
                suma += matriz[i][j];
            }
        }
        
        //imprime la matriz
        System.out.println("      Datos    ");
        for (int i = 0; i < f; i++) {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                System.out.printf(" %.0f ", matriz[i][j]);
            }
            System.out.print("|");
            System.out.println();
            
        }
        
        //promedio de la matriz
        promedio = suma/12;
        System.out.printf("El promedio de los datos es: %.2f \n", promedio);
        
        //mayores a la media   
        int contador = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > promedio){
                    contador += 1;
                }
            }
        }
        System.out.printf("%d datos son mayores a la media.\n", contador );
        
        //mostrar datos mayores al promedio
        
        //Relleno un vector con los datos mayores al promedio encontrados en la matriz
        double [] mayores = new double [contador];
        int aux = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > promedio){
                    mayores[aux] = matriz[i][j];
                    aux++;
                }
            }
        }
        //mostrar vector de los mayores
        System.out.print("Los datos mayores a la media son : ");
        for (int i = 0; i <  mayores.length; i++) {
            System.out.printf(" %.0f ",mayores[i]);
        }
        System.out.println();
    }
}
