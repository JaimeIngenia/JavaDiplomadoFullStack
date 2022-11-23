
package RutaN;


public class promedio {
    //Atributos
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    int n5 = 0;
    int suma = 0;
    int promedio = 0;
    //Metodos
    public void calcula(int n1, int n2, int n3, int n4, int n5){
        suma = n1+n2+n3+n4+n5;
        promedio = suma/5;
        System.out.println("La suma es: " + suma + "El promedio es : "+ promedio);
    
    }
    
}
