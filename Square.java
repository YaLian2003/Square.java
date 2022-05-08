// Yangyang Lian
public class MySquare extends GridItem {

   private double side;

   public MySquare(double x, double y, double side) {
       super(x, y);
       this.side = side;
   }

   @Override
   public double getArea() {
       return side * side;
   }

   @Override
   public void containsPoint() {
       System.out.println("contains point " + x + " and " + y);
   }
}
