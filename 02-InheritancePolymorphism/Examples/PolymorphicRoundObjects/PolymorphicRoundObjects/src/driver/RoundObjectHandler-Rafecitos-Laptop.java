package driver;
import java.util.*;
import util.*;
public class RoundObjectHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RoundObject> listOfRoundObjects = new ArrayList<RoundObject>();
		listOfRoundObjects.add(new RoundObject(5.2));
		listOfRoundObjects.add(new Ball(4.2, "red", 1.3));
		for(RoundObject o: listOfRoundObjects)
			System.out.printf("%s: perimeter is %.2f and radius is %.2f\n", o, o.getPerimeter(), o.getRadius());
	}

}
