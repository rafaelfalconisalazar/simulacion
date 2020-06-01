package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {
	
	private Circle circle;
	
	@Before
	public void before() {
		this.circle= new Circle(6.0);
	}

	@Test
	public void testCalculateArea() {
		assertEquals(113.09, circle.calculateArea(), 0.10);
	}

}
