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
	
	@Test
	public void testCalculatePermiter() {
		assertEquals(37.69, circle.calculatePerimeter(3.1416), 0.10);
	}
	
	@Test
	public void testCalculateVolum() {
		assertEquals(904.77, circle.calculateVolum(3.1416, 6.0), 0.10);
	}

}
