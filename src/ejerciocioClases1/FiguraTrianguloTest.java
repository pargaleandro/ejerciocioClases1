package ejerciocioClases1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FiguraTrianguloTest {
		@Test
		public void testArea(){
		FiguraTriangulo triangulo = new FiguraTriangulo();
		double area = triangulo.calcularArea();
		double perimetro = triangulo.calcularPerimetro();
		//System.out.println(area);
		assertEquals(0, area, 0);
		assertEquals(0, perimetro, 0);
		// aca se va a validar que el area sea 0
		}
}
