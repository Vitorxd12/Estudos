package firstSteps;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        //Array names a java class (like Strings). its like a dynamic names that changes its length, unlike vectors
        ArrayList<String> names = new ArrayList<String>();
        //A bit complex, isnt it
        //first you call the class, then its format IN CAMELCASE, then its name, then the whole shenanigan again.
        names.add("Vitor");
        names.add("Emilly");
        names.add("Love");
        names.add("Issues");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        names.remove(3);
        System.out.println(names);
        System.out.println("See, no issues now");
    }
}