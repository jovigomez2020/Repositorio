
package com.mycompany.mavenproject1;



public class tarea3 {
    
    public static void main(String[] args) {
        Titanic titanic = new Titanic();
        
        titanic.setnombre("Titanic");
        titanic.setdireccion("James Cameron");
        titanic.setproduccion("James Cameron");
        titanic.setguion("James Cameron");
        titanic.setmusica("James Horner");
        titanic.setpais("Estados Unidos");
        titanic.setgenero("Romance, Catastrofe, Drama");
        titanic.setduracion("195 minutos");
        titanic.setnarrador("Gloria Stuart");
        
        System.out.println("Nombre: " + titanic.getnombre());
        System.out.println("Direccion: " + titanic.getdireccion());
        System.out.println("Produccion: " + titanic.getproduccion());
        System.out.println("Guion: " + titanic.getguion());
        System.out.println("Musica: " + titanic.getmusica());
        System.out.println("Pais: " + titanic.getpais());
        System.out.println("Genero: " + titanic.getgenero());
        System.out.println("Duracion: " + titanic.getduracion());
        System.out.println("Narrador: " + titanic.getnarrador());
        
    }

    
    
    
public static class Titanic {
    private String nombre;
    private String direccion;
    private String produccion;
    private String guion;
    private String musica;
    private String pais;
    private String genero;
    private String duracion;
    private String narrador;

//get
public String getnombre(){
    return nombre;
}

public String getdireccion(){
    return direccion;
}

public String getproduccion(){
    return produccion;
}

public String getguion(){
    return guion;
}

public String getmusica(){
    return musica;
}

public String getpais(){
    return pais;
}

public String getgenero(){
    return genero;
}

public String getduracion(){
    return duracion;
}

public String getnarrador(){
    return narrador;
}

//set
public void setnombre(String a){
    this.nombre = a;
}

public void setdireccion(String a){
    this.direccion = a;
}

public void setproduccion(String a){
    this.produccion = a;
}

public void setguion(String a){
    this.guion = a;
}

public void setmusica(String a){
    this.musica = a;
}

public void setpais(String a){
    this.pais = a;
}

public void setgenero(String a){
    this.genero = a;
}

public void setduracion(String a){
    this.duracion = a;
}

public void setnarrador(String a){
    this.narrador = a;
}

}

    
}

