import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student(1001, "John", 89.98, 'A');
        Student s2 = new Student(416, "Steve", 93.31, 'A');
        Student s3 = new Student(912, "Brian", 74.01, 'C');
        Student s4 = new Student(915, "Emily", 81.05, 'B');

        
        ArrayList<Student> std = new ArrayList<Student>();
    
        std.add(s1);
        std.add(s2);
        std.add(s3);
        std.add(s4);

        for (Student s: std) System.out.println(s);
        Collections.sort(std);
    } 

}
