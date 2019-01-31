public class Square implements Shape{
  //a Square is uniquely defined by its hypotenuse.
  //(x1,y1) and (x2,y2) are opposite corners of the square.
  //AFAIK this is the most compact representation
  private int x1, y1, x2, y2;

  public Square(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public void display() {
    System.out.println("The hypotenuse of this square is: ("
      + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
  }

  public double area() {
    //if the length of a square's hypotenuse is d,
    //its area is (d^2)/2
    return Math.pow(distance2d(x1, y1, x2, y2), 2)/2;
  }

  private double distance2d(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
}
