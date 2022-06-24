package util;

public class RoundObject {
	protected double radius;
	public double getRadius() {
		return radius;
	}
	@Override
	public String toString() {
		return "generic round object of radius" + radius;
	}
	public RoundObject(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}
}
