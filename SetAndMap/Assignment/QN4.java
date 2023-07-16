package DataStrucures.SetAndMap.Assignment;

import DataStrucures.DemoCode.DemoCodeU.w3l6.api.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QN4 {

    public static Map<String, Course> mapCourses(List<Course> courses) {
        Map<String, Course> map = new HashMap<>();
        for (Course course : courses) {
            map.put(course.getCid(), course);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CS221", "DS", 4));
        courses.add(new Course("CS105", "PS", 4));
        courses.add(new Course("CS201", "PP", 3));
        courses.add(new Course("507STC", "STC", 2));
        Map<String, Course> map = mapCourses(courses);
        System.out.println("Map of courses: " + map);
    }




}
