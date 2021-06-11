/**
 * Abstract superclass for the Shape hierarchy.
 */
abstract public class Shape {

  /** Name of the shape. */
  private String name;

  /**
   * Default constructor. Create a shape named "none".
   */
  public Shape() { name = "none"; }

  /**
   * Initializing constructor. Create a shape with the specified name.
   *
   * @param name String containing the name of the shape.
   */
  public Shape(String name) { setName(name); }

  /**
   * Get the perimeter of this shape.
   *
   * @return Perimeter of the shape, as a double.
   */
  abstract public double perimeter();

  /**
   * Get the area of this shape.
   *
   * @return Area of the shape, as a double.
   */
  abstract public double area();

  /**
   * Get the name of the shape.
   *
   * @return String containing the name of the shape.
   */
  public String getName() { return name; }

  /**
   * Change the name of this shape.
   *
   * @param name String containing the new name of the shape.
   */
  public void setName(String name) { this.name = name; }

  @Override
  public String toString() {
    return String.format("%s: perimeter = %.2f, area = %.2f", getName(),
                         perimeter(), area());
  }
}
