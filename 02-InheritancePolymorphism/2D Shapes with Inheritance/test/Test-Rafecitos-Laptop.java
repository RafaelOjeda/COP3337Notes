package test;
import util.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TwoDShape> shapes = new ArrayList<TwoDShape>();
		shapes.add(new Circle("Blue", 3));
		shapes.add(new Rectangle("Pink", 6, 3));
		shapes.add(new Square("Orange", 5));
		shapes.add(new TwoDShape("Red"));

	}

}
