public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee() {
        this("No name", new Date(), 0.0, 0.0);
        wageRate = 0.0;
        hours = 0.0;
    }

    public HourlyEmployee(String name, Date hireDate, double wageRate, double hours) {
        super(name, hireDate);
        wageRate = 0.0;
        hours = 0.0;
    }

    public HourlyEmployee(HourlyEmployee other) {
        this(other.getName(), other.getHireDate(), other.wageRate, other.hours);
    }

    public void setWageRate(double wageRate) {
        if (wageRate < 0.0) {
            System.out.println("Wage rate cannot be negative");
            System.exit(0);
        }
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        if (hours < 0.0) {
            System.out.println("Working hours cannot be negative");
            System.exit(0);
        }
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getPay() {
        return getWageRate() * getHours();
    }

    public String toString() {
        return super.toString() + getWageRate() + " to work for " 
        + getHours() + ".";
    }

    public boolean equals(HourlyEmployee other) {
        return (super.equals(other)) &&
        (getWageRate() == other.getWageRate()) &&
        (getHours() == other.getHours());

    }
}
