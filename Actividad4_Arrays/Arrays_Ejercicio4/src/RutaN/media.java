
package RutaN;
import java.util.Scanner;

public class media {
    //Atributos
    Scanner entrada = new Scanner(System.in);
    int n1 = 0 ;
    int estudiantes, asignaturas = 6;
    double SumatoriaNotas = 0;
    
    //Metodos
    public void registro(){
        System.out.print("Ingrese el número de estudiantes: ");
        estudiantes = entrada.nextInt();
        double [][] tabla = new double [estudiantes][asignaturas];
        
        //Ingresa la notas en las asignaturas
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("Ingrese la calificación del alumno [ %d ] en la asignatura [ %d ]: ",(i+1),(j+1));
                tabla[i][j] = entrada.nextDouble();
            }
        }
        //Imprime las notas de los estudiantes
        System.out.println("\n|      Calificaciones     |");
        for (int i = 0; i < estudiantes; i++) {
            System.out.printf("Estudiante %d : |",(i+1));
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf(" %.1f ", tabla[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();

        /////////////*****************************************
        
        //Calcula el promedio por estudiante
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                SumatoriaNotas += tabla[i][j];
            }
            System.out.printf("El alumno [%d] tiene un promedio de notas: %.2f \n", (i+1),(SumatoriaNotas/asignaturas));
            SumatoriaNotas = 0;
        }
        System.out.println();
        //Calcula el promedio por asignatura
        for (int j = 0; j < asignaturas; j++) {
            for (int i = 0; i < estudiantes; i++) {
                SumatoriaNotas += tabla[i][j];
            }
            System.out.printf("El promedio de notas para la asignatura [%d] es: %.2f",(j+1),(SumatoriaNotas/estudiantes));
            SumatoriaNotas = 0;
            System.out.print("|");
            System.out.println();
        } 

       
    }
    
    
}
