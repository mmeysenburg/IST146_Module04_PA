/**
 * Class representing a circle in the Shape hierarchy.
 */
public class Circle extends Shape {
  /** Radius of the circle. */
  private double radius;

  /**
   * Default constructor: create a Circle with radius 0.
   */
  public Circle() {
    super("Circle");
    setRadius(0.0);
  }

  /**
   * Initializing constructor: create a circle with the specified
   * radius.
   *
   * @param radius Double containing the radius of the circle.
   */
  public Circle(double radius) {
    super("Circle");
    setRadius(radius);
  }

  @Override
  public double perimeter() {
    return 2.0 * Math.PI * radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  /**
   * Get the radius of this circle.
   *
   * @return The radius of the circle, as a double.
   */
  public double getRadius() { return radius; }

  /**
   * Change the radius of this circle.
   *
   * @param radius Double containing the new radius of the circle. 
   * If this parameter is negative, a value of zero will be used.
   */
  public void setRadius(double radius) { 
    if(radius >= 0.0) {
      this.radius = radius; 
    } else {
      this.radius = 0.0;
    }
  }
}