
package com.mycompany.mavenproject1;
import java.util.Scanner; 

public class Tarea1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nn;
        int nn2;
        int rest;
        //ejercicio 1
        System.out.println("-------------------------------Ejercicio 1------------------------------- \nHola, soy Jose Vicente Gomez Varela");
        
        //ejercicio 2
        System.out.println("-------------------------------Ejercicio 2-------------------------------\nIngrese dos digitos enteros: ");
        System.out.println("primer digito:");
        nn = teclado.nextInt();
         
        System.out.println("segundo digito:");
        nn2 = teclado.nextInt();
        
        System.out.println("resultado:");
        
        //suma
        rest = nn + nn2;
        System.out.println("suma  de: "+nn+" + "+nn2+" es: "+rest);
        
        //resta
        rest = nn - nn2;
        System.out.println("resta  de: "+nn+" - "+nn2+" es: "+rest);
        rest = nn2 - nn;
        System.out.println("resta  de: "+nn2+" - "+nn+" es: "+rest);
        
        //division
        rest = nn / nn2;
        System.out.println("division  de: "+nn+" / "+nn2+" es: "+rest);
        rest = nn2 / nn;
        System.out.println("division  de: "+nn2+" / "+nn+" es: "+rest);
        
        //multiplicacion
        rest = nn * nn2;
        System.out.println("multiplicacion  de: "+nn+" x "+nn2+" es: "+rest);
        
        System.out.println("-------------------------------Ejercicio 3-------------------------------");
        int M=6, T=1, K=-10;
        if(M>T){
            System.out.println("M>T: verdadero");
        } else {
            System.out.println("M>T: falso");
        }
        
        if(T / K == -5){
            System.out.println("M/T==-5: verdadero");
        } else {
            System.out.println("T/K==-5: falso");
        }
        
        if((M+T == 7) || (M-T == 5)){
            System.out.println("(M+T == 7) || (M-T == 5): verdadero");
        } else {
            System.out.println("(M+T == 7) || (M-T == 5): falso");
        }
        
        System.out.println("-------------------------------Ejercicio 4-------------------------------");
        int cont = 0;
        String[] nombres = new String[10];
        nombres[0] = "ESDRAS ANTONIO RAMOS LAGOS";
        nombres[1] = "CARLOS DAVID CRUZ GUEVARA";
        nombres[2] = "CARLOS JAHZEEL ERAZO TERCERO";
        nombres[3] = "KAREN LIZETH MENDOZA FLORES";
        nombres[4] = "MAGDALY GABRIELA YANEZ GOMEZ";
        nombres[5] = "IMELDA SARAI COELLO OSORTO";
        nombres[6] = "JAIRO YUBANI PONEDA MEJIA";
        nombres[7] = "IMELDA SARAI COELLO OSORTO";
        nombres[8] = "GREVIN EDGARDO SOLORZANO MEJIA";
        nombres[9] = "JOSUE ERNESTO MERAZ MEJIA";
        
        for (int i = 0; i < nombres.length; i++) {
        cont += 1;
        System.out.println(cont+"= "+nombres[i]);
        }
        
        System.out.println("-------------------------------Ejercicio 5-------------------------------");
        cont = 1;
        String[][] nombresM = new String[10][4];
        nombresM[0][0] = "ESDRAS";
        nombresM[0][1] = "LAGOS";
        nombresM[0][2] = "Electronica";
        nombresM[0][3] = "Estudiante";
        
        nombresM[1][0] = "CARLOS";
        nombresM[1][1] = "GUEVARA";
        nombresM[1][2] = "Electronica";
        nombresM[1][3] = "Estudiante";
        
        nombresM[2][0] = "CARLOS";
        nombresM[2][1] = "TERCERO";
        nombresM[2][2] = "Industrial";
        nombresM[2][3] = "Estudiante";
        
        nombresM[3][0] = "KAREN";
        nombresM[3][1] = "FLORES";
        nombresM[3][2] = "Industrial";
        nombresM[3][3] = "Estudiante";
        
        nombresM[4][0] = "MAGDALY";
        nombresM[4][1] = "GOMEZ";
        nombresM[4][2] = "Electronica";
        nombresM[4][3] = "Estudiante";
        
        
        System.out.println("NOMBRE           APELLIDO               CARRERA               TRABAJO");
        for (int i = 0; i < 5; i++) {
            cont += 1;
            for (int j = 0; j < 4; j++) {
                System.out.print(nombresM[i][j]+"             ");
            }
            System.out.println("");
        }
        
    System.out.println("-------------------------------Ejercicio 6-------------------------------");
        cont = 1;
        String[][] nombresM2 = new String[5][2];
        nombresM2[0][0] = "ESDRAS";
        nombresM2[0][1] = "65";
        
        nombresM2[1][0] = "Daniel";
        nombresM2[1][1] = "70";
        
        nombresM2[2][0] = "Marcos";
        nombresM2[2][1] = "75";
       
        nombresM2[3][0] = "CARLOS";
        nombresM2[3][1] = "80";
        
        nombresM2[4][0] = "CARLOS";
        nombresM2[4][1] = "85";
        
System.out.println("NOMBRE           NOTA               ESTADO");
        int nn3=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nombresM2[i][j]+"             ");
            }
            
          nn3 = Integer.parseInt(nombresM2[i][1]);  //convertir string en int
        if(nn3 < 80){
            System.out.print("REPROBADO");
        } else {
            System.out.print("APROBADO");
        }
            System.out.println("");
        }
        
        
    System.out.println("-------------------------------Ejercicio 7-------------------------------");
            int nn4 = 0;
            while(nn4 <= 98){//98 por la ultima suma
                nn4 =  nn4 + 2;
                System.out.print(nn4+",");

            }
        
    }
    
}
