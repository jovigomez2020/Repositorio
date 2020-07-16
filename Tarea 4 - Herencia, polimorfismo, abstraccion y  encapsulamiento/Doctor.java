//clase hija herencia-persona
public class Doctor extends Persona{
    //declarando variables y agregandoles valor
    private String nombre="Juan", profesion="Doctor";
    private int edad = 30;

    //modificando metodos de clase padre
    @Override
    public String getNombre() {
         return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getprofesion() {
       return profesion;
    }

    //set de clase
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
