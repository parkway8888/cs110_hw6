
import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver{
	public static void main(String[] args) {
		Square l = new Square(88);
		System.out.println("Area(l) = " + l.getArea());
		Rectangle h = new Rectangle(50, 60);
		System.out.println("Area(h) = " + h.getArea());
		double prep = 15.6;
		System.out.println("15 factorial = " + Math.factorial((int)prep));
		System.out.println("15 factorial = " + Math.factorialLoop((int)prep));
	}

}