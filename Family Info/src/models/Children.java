package models;
import java.util.ArrayList;
public class Children extends Parent{
    public String name;
    public int grade;
    public int age;

    public ArrayList<String> getHobbies() {
        for (String singleHobbies : hobbies){
            System.out.println(singleHobbies);
            System.out.println("My Hobby: "+singleHobbies);
        }
        return hobbies;
    }
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
    public ArrayList<String> hobbies;
    public Children(String name, int grade, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.hobbies = hobbies;
    }
    public String getFullName() {
        String name=(this.name+" "+this.family_name);
        return name;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String fullName;
    public Children(String fullName) {
        this.fullName = fullName;
    }
}
