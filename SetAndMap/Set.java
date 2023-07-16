package DataStrucures.SetAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>(Arrays.asList("Suresh",
                "Kumar","Rabin", "Ritu", "Shah"));
        TreeSet <String> setA = new TreeSet<String>();
        setA.addAll(lists);
        for (String name :setA){
            System.out.println(name);

        }
        TreeSet <String> setB = new TreeSet<String>();
        setB.add("Nabin");
        setB.add("Rabin");
        setB.add("Sabin");
        setB.add("Suresh");

        System.out.println("***********UNION**************");
        setA.addAll(setB);
        System.out.println(setA);


        System.out.println("********INTERSECTION**************");
        setA.retainAll(setB);
        System.out.println(setA);

        System.out.println("********difference**************");
        setA.removeAll(setB);
        System.out.println(setA);


        System.out.println("**************");
        setA.clear();
        System.out.println(setA);

    }
}
