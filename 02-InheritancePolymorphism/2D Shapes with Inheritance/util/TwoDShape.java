package util;

public class TwoDShape {
	protected String color;
	public TwoDShape(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Generic 2D object, color = " + color;
	}
}
