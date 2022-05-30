package jenkinsTest;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = null;
		try
		{
			triangle = new Triangle(
					Integer.parseInt(args[0]),
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2]));
		}
		catch (Exception e)
		{
			System.out.println(
				"Usage: java Quadrangle <side1:int> <side2:int> <side3:int>");
			return;
		}
		System.out.println("Type: " + triangle.classify());
		System.out.println("Triangle sides: " + triangle.getSideLengths());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
	}
}
