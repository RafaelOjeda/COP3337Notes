package util;

public class Ball extends RoundObject{
	private String color;
	private double density;
	public Ball(double radius, String color, double density) {
		super(radius);
		this.color = color;
		this.density = density;
	}
	@Override
	public String toString() {
		return "Ball of radius " + radius + ", color = "+ color + ", density = " + density;
	}
	public double getVolume() {
		return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
	}
	public double getMass() {
		return density * getVolume();
	}
}
