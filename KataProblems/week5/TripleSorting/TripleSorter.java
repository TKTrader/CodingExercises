package KataProblems.week5.TripleSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.reverseOrder;

public class TripleSorter {
    public static String sort(List<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getGpa, Comparator.reverseOrder())
                .thenComparing(Student::getAge)
                .thenComparing(Student::getFullName));// need to sort by last name here
        String solution = "";
        for (Student student : students){
            solution = solution.concat(student.getFullName()).concat(",");
        }
        return solution.substring(0,solution.length()-1); // remove last comma
    }
}
