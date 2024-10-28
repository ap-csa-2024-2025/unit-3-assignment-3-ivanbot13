import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1


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
