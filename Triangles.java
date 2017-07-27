import java.util.Scanner;

public class Triangles {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double sideA, sideB, sideC;

    System.out.println("Welcome to the triangle identifier!");
    System.out.println("Please enter the length of SIDE A of your triangle: ");
    sideA = keyboard.nextDouble();

    System.out.println("Please enter the length of SIDE B of your triangle: ");
    sideB = keyboard.nextDouble();

    System.out.println("Please enter the length of SIDE C of your triangle: ");
    sideC = keyboard.nextDouble();

    if (sideA == sideB && sideB == sideC) {
      System.out.println("Your triangle is EQUILATERAL.");
    }
    else if ((sideA*sideA)+(sideB*sideB)==(sideC*sideC)) {
      System.out.println("Your triangle is RIGHT.");
    }
    else if (sideA == sideB && sideB != sideC) {
      System.out.println("Your triangle is ISOSCELES.");
    }
    else if (sideA != sideB && sideB != sideC) {
      System.out.println("Your triangle is SCALENE.");
    }
  }
}
