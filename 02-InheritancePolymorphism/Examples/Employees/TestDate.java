public class TestDate {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println(e1);
        Employee e2 = new Employee("Robert", new Date(5,20,2019));
        System.out.println(e2);

        HourlyEmployee e3 = new HourlyEmployee();
        System.out.println(e3);
        HourlyEmployee e4 = new HourlyEmployee("John", new Date(12,11,1999), 45, 40);
        System.out.println(e4);

        SalariedEmployee e5 = new SalariedEmployee();
        System.out.println(e5);
        SalariedEmployee e6 = new SalariedEmployee("Rafael", new Date(1,1,2021), 100);
        System.out.println(e6);

    }
}
