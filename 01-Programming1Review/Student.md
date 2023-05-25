# This is a quick review of what some of your classes may have looked like in Programming 1

``` java
public class Student{
  private String firstName;
  private String lastName;
  private int score;
  private int pID;
  public String getInfo(){
    return firstName + "\t" + lastName + "\t" + score + "\t" + pID;
  }
  public String getFirstName(){return firstName;}
  public String getLastName(){return lastName;}
  public int getScore(){return score;}
  public int getPID(){return pID;}
  
}
```