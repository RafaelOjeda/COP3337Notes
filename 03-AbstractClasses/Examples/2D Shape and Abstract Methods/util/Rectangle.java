package util;

public class Rectangle extends TwoDShape {
	private double width = 1.0, height = 1.0;
	public Rectangle(String color){
		super(color);
	}
	public final double getWidth(){
		return width;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle of width " + width + ", height " + height + " and color " + color;
	}
}
