package test;
import util.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TwoDShape> shapes = new ArrayList<TwoDShape>();

		shapes.add(new Rectangle("Silver"));
		shapes.add(new Square("Golden"));
		shapes.add(new Circle());

		System.out.println("List of all shapes in one line " + shapes);

		for(TwoDShape shape: shapes) {
            System.out.println(shape.toString());
        }

	}

}
