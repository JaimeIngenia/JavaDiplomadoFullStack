package CalculaNumeroMayor;

import javax.swing.JOptionPane;

public class claseNumeroMayor {
    //Atributos
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int mayor = 0;
    int menor = 0;
    double y = 0;
    double potencia = 0;
    //Métodos
    public void leerNumeros(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 3: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 4: "));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero 5: "));
    }
    public void menor(){
        int numeros[]= {n1,n2,n3,n4,n5};      
        for (int i = 0; i < numeros.length ; i++){
            //Convertir el primer elemento en el número menor
            if(i==0){
                menor = numeros[i];
            }
            else if(i<menor){
                menor=numeros[i];  
    } }  }
    public void mayor(){
        int numeros[]= {n1,n2,n3,n4,n5};
        for (int i = 0; i < numeros.length ; i++){
            //Convertir el primer elemento en el número menor
            if(i==0){
                mayor = numeros[i];
            }
            else if(i>mayor){
                mayor = numeros[i];
    }   }   }
    public void raiz(){
        y =  Math.pow(n3, (double) 1 / 5);
    }
    public void potencia(){
        potencia =  Math.pow(n1,n5);
    }
    public void mostrar(){
        System.out.println("El numero menor es: "+menor);
        System.out.println("El numero mayor es: "+mayor); 
        System.out.println("La raiz cubica es: "+y); 
        System.out.println("La potencia del primero con el último es: "+potencia); 
    } 
}
