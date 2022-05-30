package jenkinsTest;

public interface Quadrilateral {
	public Quadrilateral setSideLengths(int s1, int s2, int s3, int s4);
	public String getSideLengths();
	public int getPerimeter();
	public double getArea();
	public String classify();
	public boolean isRightAngled();
	public boolean isImpossible();
}
