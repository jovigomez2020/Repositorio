
public class Circulo extends Formas  {
private String Dibujar;
private double Radio;
private String Calcular_Radio;


@Override
public String Dibujar(){
    super(Dibujar);
    this.Dibujar = "Circulo";
    return Dibujar;
}
public String Calcular_radio(){
    this.Calcular_Radio = "r = √A/π";
    return Calcular_Radio;
}
}