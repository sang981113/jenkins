package jenkinsTest;

public interface QuadrilateralUtil{
	public int calculatePerimeter(int s1, int s2, int s3, int s4);
	public double calculateArea(int s1, int s2, int s3, int s4);
	public String classify(int s1, int s2, int s3, int s4);
	public boolean isImpossible(int s1, int s2, int s3, int s4);
}