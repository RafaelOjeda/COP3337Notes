

``` java 
import java.util.*;
class Grade{
    int score;
    Grade(int score){
        this.score = score;
    }
    @Override
    public String toString(){
        return "Grade " + score;
    }
}
class GradeOutOf10 extends Grade{
    GradeOutOf10(int score){
        super(score);
    }
    @Override
    public String toString(){
        return "Grade out of 10 " + (score/10);
    }
}
public class MyClass {
    public static void main(String args[]) {
      ArrayList<Object> list = new ArrayList<Object>();
      list.add(25);
      list.add("Hello");
      list.add(4.32);
      list.add(new Grade(45));
      list.add(new GradeOutOf10(90));
      list.add(new Grade(35));
      list.add(new Scanner(System.in));
      for(Object obj: list)
        // Because Object is the superclass of all class all objects 
        // can be returned as type object. when obj.getClass() is called
        // it would return the corresponding class type because of its default
        // inheritance polymorphism works
        System.out.println(obj + " with type " + obj.getClass());
    }
}
```