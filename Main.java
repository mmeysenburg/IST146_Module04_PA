import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class for IST 146 Chapter 10 assignment. Your Shape, Circle, and
 * Rectangle MUST work with this class, without modification.
 *
 */
public class Main {

  /**
   * Application entry point.
   * @param args Command-line arguments; ignored by this application.
   *
   */
  public static void main(String[] args) {
    // populate a list with different shapes, based on user input
    List<Shape> shapes = new ArrayList<>();
    Scanner stdin = new Scanner(System.in);

    // use console-based input to create each shape
    System.out.printf("Enter C/R/Q: ");
    String s = stdin.nextLine();
    // loop until q / Q is entered
    while (!s.equalsIgnoreCase("Q")) {
      // decide what to do with the input
      switch (s) {
      // circle?
      case "c":
      case "C":
        System.out.printf("\tEnter radius: ");
        try {
          // make sure user entered a number
          double r = Double.parseDouble(stdin.nextLine());
          shapes.add(new Circle(r));
        } catch (NumberFormatException nfe) {
          System.out.printf("\tPlease enter a floating point radius.\n");
        }
        break;

      // rectangle?
      case "r":
      case "R":
        System.out.printf("\tEnter width: ");
        try {
          // make sure user enters numbers
          double w = Double.parseDouble(stdin.nextLine());
          System.out.printf("\tEnter height: ");
          double h = Double.parseDouble(stdin.nextLine());
          shapes.add(new Rectangle(w, h));
        } catch (NumberFormatException nfe) {
          System.out.printf("\tPlease enter floating point dimensions.\n");
        }
        break;

      // error in input? (not C/R/Q)
      default:
        System.out.printf(
            "\tEnter C for circle, R for rectangle, or Q to quit.\n");

      } // switch

      // get next input
      System.out.printf("Enter C/R/Q: ");
      s = stdin.nextLine();

    } // while

    // output the shapes -- note the polymorphism!
    for (Shape shape : shapes) {
      System.out.println(shape);
    }

  } // main method

} // Main class
