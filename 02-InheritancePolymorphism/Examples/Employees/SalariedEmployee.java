public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
        this("Rafael", new Date(), 0);

        salary = 0;
    }

    public SalariedEmployee(String name, Date hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    } 

    public SalariedEmployee(SalariedEmployee other) {
        this(other.getName(), other.getHireDate(), other.getSalary());
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be less than 0");
            System.exit(0);
        }

    }

    public double getSalary() {
        return salary;
    }

    public double getPay() {
        return getSalary()/12;
    }

    public String toString() {
        return getName() + " was hired on " + getHireDate() + " for a salary $" + getSalary() + "";
    }

    public boolean equals(SalariedEmployee other) {
        return super.equals(other) && getSalary() == other.getSalary();
    }

}
