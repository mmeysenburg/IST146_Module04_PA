import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for Rectangles and Circles.
 */
public class ShapeTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testCircleDefaultConstructor() {
    Circle c = new Circle();
    assertEquals("Circle", c.getName());
    assertEquals(0.0, c.getRadius(), 0.0);
    assertEquals(0.0, c.area(), 0.001);
    assertEquals(0.0, c.perimeter(), 0.001);
  }

  @Test
  public void testCircleInitializingConstructor() {
    Circle c = new Circle(13);
    assertEquals("Circle", c.getName());
    assertEquals(13.0, c.getRadius(), 0.0);
    assertEquals(530.92916, c.area(), 0.001);
    assertEquals(81.68141, c.perimeter(), 0.001);
  }

  @Test
  public void testCircleSetRadius() {
    Circle c = new Circle();
    c.setRadius(13);
    assertEquals(13.0, c.getRadius(), 0.0);
    assertEquals(530.92916, c.area(), 0.001);
    assertEquals(81.68141, c.perimeter(), 0.001);
    c.setRadius(-13);
    assertEquals(0.0, c.getRadius(), 0.0);
    assertEquals(0.0, c.area(), 0.001);
    assertEquals(0.0, c.perimeter(), 0.001);
  }

  @Test
  public void testCircleToString() {
    Shape c = new Circle(13);
    assertEquals("Circle: perimeter = 81.68, area = 530.93",
      c.toString());
  }

  @Test
  public void testRectangleDefaultConstructor() {
    Rectangle r = new Rectangle();
    assertEquals("Rectangle", r.getName());
    assertEquals(0.0, r.getWidth(), 0.0);
    assertEquals(0.0, r.getHeight(), 0.0);
    assertEquals(0.0, r.area(), 0.001);
    assertEquals(0.0, r.perimeter(), 0.001);
  }

  @Test
  public void testRectangleInitializingConstructor() {
    Rectangle r = new Rectangle(13, 9);
    assertEquals("Rectangle", r.getName());
    assertEquals(13.0, r.getWidth(), 0.0);
    assertEquals(9.0, r.getHeight(), 0.0);
    assertEquals(117.0, r.area(), 0.001);
    assertEquals(44.0, r.perimeter(), 0.001);
  }

  @Test
  public void testRectangleSetWidth() {
    Rectangle r = new Rectangle(0, 9);
    r.setWidth(13);
    assertEquals(13.0, r.getWidth(), 0.0);
    assertEquals(9.0, r.getHeight(), 0.0);
    assertEquals(117.0, r.area(), 0.001);
    assertEquals(44.0, r.perimeter(), 0.001);
    r.setWidth(-13);
    assertEquals(0.0, r.getWidth(), 0.0);
    assertEquals(9.0, r.getHeight(), 0.0);
    assertEquals(0.0, r.area(), 0.001);
    assertEquals(18.0, r.perimeter(), 0.001);
  }

  @Test 
  public void testRectangleSetHeight() {
    Rectangle r = new Rectangle(13, 0);
    r.setHeight(9);
    assertEquals(13.0, r.getWidth(), 0.0);
    assertEquals(9.0, r.getHeight(), 0.0);
    assertEquals(117.0, r.area(), 0.001);
    assertEquals(44.0, r.perimeter(), 0.001);
    r.setHeight(-9);
    assertEquals(13.0, r.getWidth(), 0.0);
    assertEquals(0.0, r.getHeight(), 0.0);
    assertEquals(0.0, r.area(), 0.001);
    assertEquals(26.0, r.perimeter(), 0.001);
  }

  @Test
  public void testRectangleToString() {
    Shape r = new Rectangle(13, 9);
    assertEquals("Rectangle: perimeter = 44.00, area = 117.00",
      r.toString());
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("ShapeTest");
  }
}