import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    public static void main(String[] args) {
        // Create ArrayList of Student
        ArrayList<Student> students = new ArrayList<>();

        // Add Student objects
        students.add(new Student("John", 18, 85));
        students.add(new Student("Sara", 19, 90));
        students.add(new Student("Kumar", 17, 78));

        // Display using Iterator
        System.out.println("Student Details:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            s.display();
        }
    }
}
