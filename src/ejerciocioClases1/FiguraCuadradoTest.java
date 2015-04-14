package ejerciocioClases1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FiguraCuadradoTest {
		@Test
		public void testArea(){
		FiguraCuadrado cuadrado = new FiguraCuadrado();
		double area = cuadrado.calcularArea();
		double perimetro = cuadrado.calcularPerimetro();
		//System.out.println(area);
		assertEquals(0, area, 0);
		assertEquals(0, perimetro, 0);
		// aca se va a validar que el area sea 0
		}
}
