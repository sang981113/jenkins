package jenkinsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testGetArea1() {
		Triangle tri = new Triangle(3,4,5);
		assertEquals(5, tri.getArea());
	}

	@Test
	void testGetArea2() {
		Triangle tri = new Triangle(3,4,0);
		assertEquals(-1, tri.getArea());
	}
	
	@Test
	void testClassify1() {
		Triangle tri = new Triangle(0,0,0);
		assertEquals("impossible", tri.classify());
	}
	
	@Test
	void testClassify2() {
		Triangle tri = new Triangle(3,3,3);
		assertEquals("equilateral", tri.classify());
	}
	
	@Test
	void testClassify3() {
		Triangle tri = new Triangle(3,3,5);
		assertEquals("isosceles", tri.classify());
	}
	
	@Test
	void testClassify4() {
		Triangle tri = new Triangle(3,4,5);
		assertEquals("right-angled", tri.classify());
	}
	
	@Test
	void testClassify5() {
		Triangle tri = new Triangle(3,4,6);
		assertEquals("scalene", tri.classify());
	}

	@Test
	void testIsImpossible1() {
		Triangle tri = new Triangle(3,3,3);
		assertEquals(false, tri.isImpossible());
	}
	
	@Test
	void testIsImpossible2() {
		Triangle tri = new Triangle(3,3,0);
		assertEquals(true, tri.isImpossible());
	}
	
	@Test
	void testIsImpossible3() {
		Triangle tri = new Triangle(3,0,3);
		assertEquals(true, tri.isImpossible());
	}
	
	@Test
	void testIsImpossible4() {
		Triangle tri = new Triangle(0,3,3);
		assertEquals(true, tri.isImpossible());
	}
}
