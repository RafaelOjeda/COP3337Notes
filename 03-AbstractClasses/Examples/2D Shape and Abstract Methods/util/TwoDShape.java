package util;

public abstract class TwoDShape {
	protected String color;
	public TwoDShape(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Generic 2D object, color = " + color;
	}
	public abstract double getPerimeter();
	public abstract double getArea();
}
