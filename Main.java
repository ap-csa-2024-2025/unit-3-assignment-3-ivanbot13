import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // TODO: Problem 1
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
    if (y == 0)
		{
			System.out.println("Can't divide by 0");
		}
		else
		{
			double ratio = (double) x / y;
			if (1 < ratio && ratio <= 8)
			{
				System.out.println("Ratio OK");
			}
		}

    // TODO: Problem 2


    // TODO: Problem 3


  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise. Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal

  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {

    boolean eqWidth = r1.getWidth() == r2.getWidth();
    boolean eqLength = r1.getLength() == r2.getLength();
    return eqWidth && eqLength;

  }
}
