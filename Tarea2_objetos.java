
package com.mycompany.mavenproject1;
import java.util.Scanner; 

class objetos {
   
//Primer método: Retornar un mensaje que diga: "Estoy aprendiendo, pero seré el mejor
//programador del mundo".
String retornarmensaje(){
 String msj = "Estoy aprendiendo, pero seré el mejor\n" +
"programador del mundo";  
    
   return msj;
}//fin 1


//Segundo método: Declarar una variable entera y asignarle un número X que represente
//la nota del estudiante. Retornar un mensaje dependiendo de esa variable si es mayor o
//igual a 70, el mensaje debe decir Aprobado, de lo contrario Reprobado.
String variableEntera(int a) {
 String msj = "Aprovado";
 String msj2 = "Reprobado";
 
    if (a >= 70){
       return msj; 
    }
    else {
        return msj2;
    }
}//fin 2


//Tercer método: Retornar el resultado de una división de dos enteros que proporcionemos
//como parámetros, considerar que la división entre un denominador cero no puede ser
//realizado
double resultadoDivision(int a, int b){
        int c = a / b;
        return c;    
}//fin 3


//Cuarto método: Debe retornar una lista de numeros del 1 al X. Donde X es un parámetro
//de entrada del método a crear.
String listadenumeros(int x){
    String numeros = "";
        for (int i = 1; i <= x; i++) {
        numeros += i+", 20";
        }
        
        return numeros;

}//fin 4

}

public class Tarea2_objetos {
	public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            objetos metd = new objetos();
            
            int nn;
            int nn2;

            
            //metodo 1
            System.out.println("Metodo 1:\n" + metd.retornarmensaje() + "\n");
            
            
            //metodo 2
	    System.out.println("Metodo 2:\n Ingrese nota (solo numeros):");
            nn = teclado.nextInt();
            
            System.out.println("Su estado es: " + metd.variableEntera(nn));
            
            
            //metodo 3
            System.out.println("Metodo 3:\n Ingrese primer numero (solo numeros):");
            nn = teclado.nextInt();
            
            while(nn <= 0){//ciclo para asegurarnos de que el usuario ingrese un numero superior a 0
            System.out.println("Error, el digito debe ser superior a 0:");
            nn = teclado.nextInt();
            }
            
            System.out.println("Metodo 3:\n Ingrese segundo numero (solo numeros):");
            nn2 = teclado.nextInt();
            
            while(nn2 <= 0){//ciclo para asegurarnos de que el usuario ingrese un numero superior a 0
            System.out.println("Error, el digito debe ser superior a 0:");
            nn2 = teclado.nextInt();
            }
            
            System.out.println("resultado: " + metd.resultadoDivision(nn, nn2));
            
            
            //metodo 4
            System.out.println("Metodo 4:\n Ingrese valor: (solo numeros):");
            nn = teclado.nextInt();
            
            while(nn <= 1){//ciclo para asegurarnos de que el usuario ingrese un numero superior a 1
            System.out.println("Error, el digito debe ser superior a 1:");
            nn = teclado.nextInt();
            }
     
            System.out.println("resultado: " + metd.listadenumeros(nn));
            
	}
}


