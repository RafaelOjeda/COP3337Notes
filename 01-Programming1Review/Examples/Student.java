public class Student {
    // Instance variables
    private String name;
    private int ID;
    private char grade;
    private double percentage;

    // No argument constructor
    public Student () {
        // name = "No name";
        // ID = 0;
        // grade = 'F';
        // percentage = 0.0;

        this("No name", 0, 'F', 0.0);
    }

    // Argument constructor
    public Student (String name, int ID, char grade, double percentage) {
        setName(name);
        setID(ID);
        setGrade(grade);
        setPercentage(percentage);
    }

    // Copy constructor
    public Student (Student otherStudentObject) {
        // this.name = otherStudentObject.name;
        // this.ID = otherStudentObject.ID;
        // this.grade = otherStudentObject.grade
        // this.percentage = otherStudentObject.percentage;
        
        this(otherStudentObject.name, otherStudentObject.ID, otherStudentObject.grade, otherStudentObject.percentage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)  
            this.name = name;
        else System.out.println("Invalid name");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID >= 100)
            this.ID = ID;
        else System.out.println("Invalid ID");
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')
            this.grade = grade;
        else System.out.println("Invalid letter grade");
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if (percentage >= 0.0) 
            this.percentage = percentage;
        else System.out.println("Invalid percentage");
    }

    public String toString() {
        return getName() + " " + getID() + " " + getPercentage() + " " + getGrade();
    }

    public boolean equals(Student otherStudent) {
        
    }
}