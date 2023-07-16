package DataStrucures.SetAndMap.Assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountValues {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dean", "Dave", "Zaineh", "Yasmeen", "Dave", "Zaineh");
        int count = countDistinctValues(list);
        System.out.println("Number of distinct values: " + count);
    }

    public static int countDistinctValues(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return set.size();
    }


}
