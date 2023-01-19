import models.Children;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Art");
        hobbies.add("Dancing");
        hobbies.add("singing");
        hobbies.add("Travelling");
        hobbies.add("Watching K-drama");

        Children c1 = new Children("Ashna", 12, 18, hobbies);

        System.out.println(c1.getFullName() + " of age " + c1.age + " studies in grade " + c1.grade + " and his hobbies are:");
        System.out.println(c1.getFullName() + " of age " + c1.age + "lives in " + c1.house_Address + "and studies in grade " + c1.grade + " and his hobbies are:");
        System.out.println(c1.getHobbies());
    }
}