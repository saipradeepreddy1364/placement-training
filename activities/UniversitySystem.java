package activities;

import java.util.Random;

// Abstract class
abstract class Person {
    String name;
    int age;
    String type;

    abstract void displayDetails();
}

// Interface
interface UniversityMember {
    void getMemberType();
    Random gen = new Random();
}

// Student class
class Student extends Person implements UniversityMember {
    int rollNumber;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        rollNumber = gen.nextInt(999) + 1; // FIXED
        this.type = "Student";
    }

    void displayDetails() {
        System.out.println("Member Type: " + type);
        System.out.println("Name of the student: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course); // FIXED
    }

    public void getMemberType() {
        System.out.println("Member Type: " + type);
    }
}

// Faculty class
class Faculty extends Person implements UniversityMember {
    int facultyId;
    String department;

    Faculty(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.facultyId = gen.nextInt(999) + 1; // FIXED
        this.type = "Faculty";
    }

    void displayDetails() {
        System.out.println("Member Type: " + type);
        System.out.println("Name of the Faculty: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public void getMemberType() {
        System.out.println("Member Type: " + type);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {

        Student obj = new Student("Pradeep", 20, "Java");
        Faculty obj1 = new Faculty("Radhika", 45, "CSE");

        obj.displayDetails();
        System.out.println();

        obj1.displayDetails();
    }
}