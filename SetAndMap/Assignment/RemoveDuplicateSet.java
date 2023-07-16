package DataStrucures.SetAndMap.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateSet {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dean", "Dave", "Zaineh", "Yasmeen", "Dave", "Zaineh");
        List<String> result = removeDuplicates(list);
        System.out.println("List with duplicates removed: " + result);
    }

    public static <E> List<E> removeDuplicates(List<E> list) {
        Set<E> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
