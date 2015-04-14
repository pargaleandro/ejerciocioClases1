package ejerciocioClases1;

public class FiguraCuadrado {
	float ladoA=0;
	float ladoB=0;
	
	public double calcularArea(){
		double area= ladoA * ladoB;
		return area;
	}
	
	public float calcularPerimetro(){
		float perimetro = ladoA * 2 + ladoB * 2;
		return perimetro;
	}
}
