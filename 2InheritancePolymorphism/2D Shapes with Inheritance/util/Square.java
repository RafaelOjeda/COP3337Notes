package util;

public class Square extends Rectangle{
	public Square(String color, double length) {
		super(color, length, length);
	}
	@Override
	public String toString() {
		return "Square of length " + width + " and color " + color;
	}
}
