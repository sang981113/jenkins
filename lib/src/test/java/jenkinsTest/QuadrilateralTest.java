package jenkinsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class QuadrilateralTest {
	@Test
	void getPerimeterTest() {
		QuadrilateralUtil mockedQuadUtil = mock(QuadrilateralUtil.class);
		when(mockedQuadUtil.calculatePerimeter(2, 3, 4, 5)).thenReturn(14);
		Quadrilateral quad = new Quadrilateral(2, 3, 4, 5);
		quad.setQuadUtil(mockedQuadUtil);
		assertEquals(13, quad.getPerimeter());
	}
	
	@Test
	void getAreaTest() {
		QuadrilateralUtil mockedQuadUtil = mock(QuadrilateralUtil.class);
		when(mockedQuadUtil.calculateArea(3, 4, 3, 4)).thenReturn(12.0);
		Quadrilateral quad = new Quadrilateral(3, 4, 3, 4);
		quad.setQuadUtil(mockedQuadUtil);
		assertEquals(12.0, quad.getArea());
	}
	
	@Test
	void getKindTest() {
		QuadrilateralUtil mockedQuadUtil = mock(QuadrilateralUtil.class);
		when(mockedQuadUtil.classify(1, 2, 3, 4)).thenReturn("rectangle");
		Quadrilateral quad = new Quadrilateral(1, 2, 3, 4);
		quad.setQuadUtil(mockedQuadUtil);
		assertEquals("rectangle", quad.getKind());
	}
}
