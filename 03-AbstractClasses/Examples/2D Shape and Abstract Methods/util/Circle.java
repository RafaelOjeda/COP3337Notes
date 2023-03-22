package util;

public class Circle extends TwoDShape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public Circle(){
		super("Blue");
		this.radius = 1.0;
	}
	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}
	@Override
	public String toString() {
		return "Circle of radius " + radius + " and color " + color;
	}
}
