public class Employee {

    private String name;
    private Date hireDate;

    public Employee() {
        this("No name", new Date());
    }

    public Employee(String name, Date hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    public Employee(Employee otherEmployee) {
        this(otherEmployee.name, otherEmployee.hireDate);
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Invalid employee name");
            System.exit(0);
        }
        this.name = name;
    }

    public void setHireDate(Date hireDate) {
        if (hireDate == null) {
            System.out.println("Invalid hireDate");
            System.exit(0);
        }
        this.hireDate = new Date(hireDate);
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String toString() {
        return getName() + " was hired on " + getHireDate();
    }

    public boolean equals(Employee other) {
        return (getName().equals(other.getName())) && (getHireDate().equals(other.getHireDate()));
    }
    
}
