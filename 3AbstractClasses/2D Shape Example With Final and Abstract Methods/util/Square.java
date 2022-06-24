package util;

public class Square extends Rectangle{
	public Square(String color){
		super(color);
	}
	@Override
	public String toString() {
		return "Square of side " + getWidth() + " and color " + color;
	}
}
