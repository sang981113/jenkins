package jenkinsTest;

public class Triangle
{
	private int side1, side2, side3;
	private static final String P_EQUILATERAL = "equilateral";
	private static final String P_ISOSCELES   = "isosceles";
	private static final String P_RIGHTANGLED = "right-angled";
	private static final String P_SCALENE     = "scalene";
	private static final String P_IMPOSSIBLE  = "impossible";

	public Triangle(int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	public Triangle setSideLengths(int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
		return this;
	}

	public String getSideLengths()
	{
		return side1 + "," + side2 + "," + side3;
	}

	public int getPerimeter()
	{  
		return side1 + side2 + side3;
	}

	public double getArea()
	{
		if (!isImpossible())
		{//getPerimeter()의 반환 타입이 int형이기 때문에 나누기 연산을 할 때 오류 발생
			return Math.sqrt(getPerimeter()
			/ 2
			* (getPerimeter() / 2 - side1)
			* (getPerimeter() / 2 - side2)
			* (getPerimeter() / 2 - side3));
		}
		return -1;
	}

	public String classify()
	{
		if (isImpossible())
		{
			return P_IMPOSSIBLE;
		}

		if (side1 == side2)
		{//side2 == side3 && side1= side2인 경우 ISOSCELES가 아닌 SCALENE을 반환 : (side1 == side2 || side2 == side3 || side1 == side3)
			if (side2 == side3)
			{
				return P_EQUILATERAL;
			}
			else
			{
				return P_ISOSCELES;
			}
		}

		if (isRightAngled())
		{
			return P_RIGHTANGLED;
		}

		return P_SCALENE;
	}

	public boolean isRightAngled()
	{//모든 변에 대해서 검사하지 않음 : 가장 긴 변에 대해서만 수행하면 된다.
		int[] sides = new int[] { side1, side2, side3 };

		return sides[2]
			== Math.sqrt((long) sides[0] * sides[0] + (long) sides[1] * sides[1]);
	}

	public boolean isImpossible()
	{//삼각형의 성립조건 작은 두변의 길이의 합이 가장 큰 변의 길이의 합보다 크다.
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
		{
			return true;
		}
		return false;
	}
}