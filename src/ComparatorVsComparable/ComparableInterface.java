package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age % 10, that.age % 10);
    }
}

public class ComparableInterface {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(18, "Alex"));
        students.add(new Student(33, "William"));
        students.add(new Student(21, "David"));
        students.add(new Student(29, "John"));

        Collections.sort(students);   // 🔥 No comparator

        for(Student s : students){
            System.out.println(s.age + " " + s.name);
        }
    }
}
