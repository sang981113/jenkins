package jenkinsTest;

public class Quadrilateral {
	int side1, side2, side3, side4;
	QuadrilateralUtil quadUtil;
	
	public Quadrilateral() {}
	
	public Quadrilateral(int s1, int s2, int s3, int s4) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		side4 = s4;
	}
	
	public void setQuadUtil(QuadrilateralUtil quadUtil) {
		this.quadUtil = quadUtil;
	}
	
	public int getPerimeter() {
		return quadUtil.calculatePerimeter(side1, side2, side3, side4);
	}
	public double getArea() {
		return quadUtil.calculateArea(side1, side2, side3, side4);
	}
	public String getKind() {
		return quadUtil.classify(side1, side2, side3, side4);
	}
}
