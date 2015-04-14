package ejerciocioClases1;

public class FiguraTriangulo {
	float base=0;
	float altura=0;
	float ladoA=0;
	float ladoB=0;
	float ladoC=0;
	
	public double calcularArea(){
		double area = (base * altura) / 2;
		return area;
	}
	
	public double calcularPerimetro(){
		double perimetro = ladoA + ladoB + ladoC;
		return perimetro;
	}

}
