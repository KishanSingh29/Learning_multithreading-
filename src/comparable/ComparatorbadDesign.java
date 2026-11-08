package comparable;
import java.util.*;

public class ComparatorbadDesign {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("kishan",79, 7));
        list.add(new Student("Rohit", 102, 89));
        list.add(new Student("Rohan", 103, 93));
        list.add(new Student("Sonu", 104, 98));

        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name + ", " + s.rollNo + ", " + s.marks);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s){
        return this.marks - s.marks;
    }

}