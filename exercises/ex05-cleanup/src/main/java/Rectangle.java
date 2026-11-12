/** A rectangle whose dimensions can be scaled. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the initial width
   * @param height the initial height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Computes this rectangle's area.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions by the given factor.
   *
   * @param factor the multiplier for each dimension
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * Compares this rectangle's area with another's.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has greater area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
