
public class Triangulo extends Formas{
private double Angulo;
private String Calcular_Area;
private String Dibujar;

@Override
public String Dibujar(){
    this.Dibujar = "Triangulo";
    return Dibujar;
}
 
public String Calcular_area(){
    this.Calcular_Area = "A=b*h/2";
    return Calcular_Area;
}
}
