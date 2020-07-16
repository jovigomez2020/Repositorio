
public class Main {
      public static void main (String[] args) {
      Honduras hon = new Honduras();
      Elsalvador elsa = new Elsalvador();
      CostaRica cos = new CostaRica();
      
      System.out.println("-------Clase Honduras");
      System.out.println("Pais: "+hon.getPais());    
      System.out.println("Presidente: "+hon.getPresidente());
      System.out.println("-------Clase CostaRica");
      System.out.println("Pais: "+cos.getPais()); 
      System.out.println("Presidente: "+cos.getPresidente());    
      System.out.println("-------Clase Elsalvador");
      System.out.println("Pais: "+elsa.getPais()); 
      System.out.println("Presidente: "+elsa.getPresidente()); 
          
      }
}
