public class Triangle implements Shape {
  //(x1,y1), (x2,y2), (x3,y3) are the 3 vertices of the Triangle
  private int x1, x2, x3, y1, y2, y3;

  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
  }

  public void display(){
    System.out.println("The three points of this triangle are: ("
      + x1 + "," + y1 + ") (" + x2 + "," + y2 + ") (" + x3 + "," + y3 + ")");
  }

  public double area() {
    //this is the general formula for area of a triangle from the vertices
    double area = Math.abs( ( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) ) / 2 );
    return area;
  }
}
