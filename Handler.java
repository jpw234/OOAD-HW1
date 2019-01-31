import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Handler{
  public static void main(String[] args) {
    //initialize collection of shapes
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Triangle(0, 0, 0, 1, 1, 0));
    shapes.add(new Circle(1, 1, 3));
    shapes.add(new Square(0, 1, 1, 0));

    //sort shapes by some characteristic - I chose area
    Collections.sort(shapes, new ShapeComparator());

    //print number of shapes in the 'database'
    System.out.println("There are " + shapes.size() + " shapes total.");
    //ask each shape to display itself
    shapes.forEach( (a) -> a.display() );
  }
}

//implement Comparator as suggested by https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
class ShapeComparator implements Comparator<Shape> {
  @Override
  public int compare(Shape o1, Shape o2) {
      if(o1.area() < o2.area()) return -1;
      else if (o2.area() < o1.area()) return 1;
      else return 0;
  }
}
