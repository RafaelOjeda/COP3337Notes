package util;

public class Rectangle extends TwoDShape {
	protected double width, height;
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
	public double getArea() {
		return width * height;
	}
	@Override
	public String toString() {
		return "Rectangle of width " + width + ", height " + height + " and color " + color;
	}
}
