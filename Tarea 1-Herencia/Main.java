
public class Main {
      public static void main (String[] args) {
     Formas form = new Formas();
     Circulo circ = new Circulo();
     Linea lin = new Linea();
     Triangulo trian = new Triangulo();
     Cuadrado cuad = new Cuadrado();

     System.out.println("-------Clase Formas:");
     System.out.println("Dibujar: "+form.Dibujar());
     System.out.println(form.EstablecerColor());
          
     System.out.println("-------Clase Circulo:");
     System.out.println("Dibujar: "+circ.Dibujar());
     System.out.println(circ.Calcular_radio());  
     
     System.out.println("-------Clase Linea:");
     System.out.println("Dibujar: "+lin.Dibujar());
          
     System.out.println("-------Clase Triangulo:");
     System.out.println("Dibujar: "+trian.Dibujar());
     System.out.println(trian.Calcular_area());    
       
     System.out.println("-------Clase Cuadrado:");
     System.out.println("Dibujar: "+cuad.Dibujar());
     System.out.println(cuad.Calcular_area());  
      }  
}
