package KataProblems.week5.TripleSorting;

public class Student {
    int gpa;
    int age;
    String name;

    public Student(int age, int gpa, String name){
        this.gpa = gpa;
        this.age = age;
        this.name = name;
    }

    public int getGpa(){
        return gpa;
    }

    public int getAge(){
     return age;
    }

    public String getFullName(){
        return name;
    }

    public String getLastName() {
        return name.split(" ")[0];
    }
}
