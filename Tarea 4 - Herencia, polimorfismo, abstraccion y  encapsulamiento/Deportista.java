
//clase hija
public class Deportista extends Persona {
    //variables y datos
    private String nombre="Rafael", profesion="Deportista";
    private int edad = 24;

    //modificando metodos
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
