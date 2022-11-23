
package RutaN;

public class promedio {
    //Atributos
    int n1 = 0;
    double [] vector = new double[50];
    
    double suma = 0, promedio = 0;
    //Metodos
    public void calculo(){
        System.out.println("HolaMundo");        
        
        for (int i = 0; i < 50; i++) {
            vector[i] = Math.round(Math.random()*100);
            suma += vector[i];
        }
        promedio = Math.round(suma/50);
        System.out.printf("\nEl Promedio de los 50 números es: %.0f", promedio);
        System.out.println("\nLos números mayores al promedio son: ");
        for (int i = 0; i < 50; i++) {
            if (vector[i] > promedio){
                System.out.printf("%.0f , ", vector[i]);
            }
        }    
    }
}
