public class Student implements Comparable<Student> {
    private int studentID;
    private String studentName;
    private double studentGrade;
    private char studentLetterGrade;
    
    public Student(int studentID, String studentName, double studentGrade, char studentLetterGrade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentLetterGrade = studentLetterGrade;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getStudentGrade() {
        return studentGrade;
    }
    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }
    public char getStudentLetterGrade() {
        return studentLetterGrade;
    }
    public void setStudentLetterGrade(char studentLetterGrade) {
        this.studentLetterGrade = studentLetterGrade;
    }
    @Override
    public int compareTo(Student o) {

        if (getStudentName().compareTo(o.getStudentName()) != 0) {
            return getStudentName().compareTo(o.getStudentName());
        } else {
            if (this.studentID > o.studentID) {
                return 1;
            } else if (this.studentID < o.studentID) {
                return -1;
            } else {
                return 0;
            }
        }


    }

    @Override
    public String toString() {
        return "ID: " + getStudentID() + ", Name: " + getStudentName() + ", Grade: " + getStudentGrade() + ", Letter: " + getStudentLetterGrade();
    } 

}