import java.util.Scanner;

public class CalculatorPractice {
  public static void main (String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double a, b, sum, diff, prod, quot;
    String operation;

    System.out.println("Let's do some calculations!");
    System.out.println("Enter your first number.");
    a = keyboard.nextDouble();

    System.out.println("Enter your second number.");
    b = keyboard.nextDouble();

    System.out.println("Would you like to +, -, x, or / ?");
    operation = keyboard.next();

    sum = a + b;
    diff = a - b;
    prod = a * b;
    quot = a / b;

    if (operation.equals("+")) {
      System.out.println(" The sum of your numbers is " + sum );
    }
    else if (operation.equals("-")) {
      System.out.println(" The difference of your numbers is " + diff);
    }
    else if (operation.equals("x")) {
      System.out.println(" The product of your numbers is " + prod);
    }
    else if (operation.equals("/")) {
      System.out.println(" The quotient of your numbers is " + quot);
    }
    else {//any other entry
      System.out.println("ERROR: NOT A VALID SELECTION.");
    }

  }
}
