
package RutaN;

public class ecuacionCuadratica {
    
    //Atributos
    int a=0;
    int b=0;
    int c=0;
    float resultado=0;
    //Metodos
    public void funcion(int a, int b, int c){
        resultado = -b +((b*b)-(4*a*c));
        System.out.println(resultado);
    }
    
}
