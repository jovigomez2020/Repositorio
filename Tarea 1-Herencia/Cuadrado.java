
public class Cuadrado extends Formas{
private double area;
private String Calcular_Area;
private String Dibujar;


@Override
public String Dibujar(){
    this.Dibujar = "Cuadrado";
    return Dibujar;
}

public String Calcular_area(){
    this.Calcular_Area = "A=a^2";
    return Calcular_Area;
}
}
