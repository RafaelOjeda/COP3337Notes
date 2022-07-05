package util;

public interface Drivable {
    public double MILE_TO_KM = 1.60934;
    public void accelerate(int value);
    public void brake (int value);
    public int getSpeed();
}

