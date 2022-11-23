

package RutaN;


public class habitantes {
    //Atributos
    int tamTorres = 7, tamPisos = 20, tamAptos = 6;
    int [][][] complejo = new int [tamTorres][tamPisos][tamAptos];

    //Metodos
    public void a(){
        //LLenar complejo habitacional con habitantes aleatorios
        for (int i = 0; i < tamTorres; i++) {
            for (int j = 0; j < tamPisos; j++) {
                for (int k = 0; k < tamAptos; k++) {
                    complejo[i][j][k] = (int) Math.round(Math.random()*10);
                }
            }
        }
        
        //cantidad total de habitantes del complejo
        int habitantes = 0;
        for (int i = 0; i < tamTorres; i++) {
            for (int j = 0; j < tamPisos; j++) {
                for (int k = 0; k < tamAptos; k++) {
                    habitantes += complejo[i][j][k];
                }
            }
        }
        System.out.println("Total de habitantes del complejo son: " + habitantes);
        System.out.println();
        //Promedio de habitantes por Torre
        int habitantesPiso = 0;
        for (int i = 0; i < tamTorres; i++) {
            for (int j = 0; j < tamPisos; j++) {
                for (int k = 0; k < tamAptos; k++) {
                    habitantesPiso += complejo[i][j][k];
                }
                System.out.printf("El piso [%d] de la torre [%d] tiene en promedio: %d habitantes.\n",(j+1),(i+1),(habitantesPiso/tamAptos));
                habitantesPiso = 0;
            }
            System.out.println();
        }
        System.out.println();
        
        //Promedio de habitantes por Torre
        int habitantesTorre = 0;
        for (int i = 0; i < tamTorres; i++) {
            for (int j = 0; j < tamPisos; j++) {
                for (int k = 0; k < tamAptos; k++) {
                    habitantesTorre += complejo[i][j][k];
                }
            }
            System.out.printf("La torre [ %d ] tiene en promedio %d habitantes. \n",(i+1),(habitantesTorre/tamTorres));
            habitantesTorre = 0;
        }

    }
    
}
