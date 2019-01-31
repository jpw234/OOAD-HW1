public class Circle implements Shape {
  //a Circle is uniquely defined by its center point (x,y) and a radius
  private int x;
  private int y;
  private int radius;

  public Circle(int x, int y, int r){
    this.x = x;
    this.y = y;
    radius = r;
  }

  public void display() {
    System.out.println("This is a circle with center at point (" + x + "," + y + "), radius " + radius);
  }

  public double area() {
    return Math.PI * 2 * radius;
  }
}
