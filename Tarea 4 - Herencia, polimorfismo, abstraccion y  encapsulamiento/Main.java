
public class Main {
      public static void main (String[] args) {
     //llamando clases hijas
     Doctor doc = new Doctor();
     Deportista dpt = new Deportista();

     //llamando metodos e imprimiendo en consola
     System.out.println("-------Clase Deportista:");
     System.out.println("Nombre: "+doc.getNombre());
     System.out.println("Profesion: "+doc.getprofesion());
          
     System.out.println("-------Clase Doctor:");
     System.out.println("Nombre: "+dpt.getNombre());
     System.out.println("Profesion: "+dpt.getprofesion());
     
     
       
      }  
}