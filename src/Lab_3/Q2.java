package Lab_3;

import java.util.Scanner;

class Student {
    int roll, hostelnum, wing, roomnum;
    String firstname, lastname, dob, course;

    Student () {
        roll = 0;
        hostelnum = 0;
        wing = 0;
        roomnum = 0;
        firstname = null;
        lastname = null;
        dob = null;
        course = null;
    }

    Student (int rollnum, String firstname, String lastname, String course) {
        this.roll = rollnum;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course = course;
    }

    void update() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        firstname = s.next();
        lastname = s.next();
        System.out.print("Roll number: ");
        roll = s.nextInt();
        System.out.print("Course: ");
        course = s.next();
        System.out.println("Updated...");
    }

    void display() {
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s = new Student(23, "Subhendu", "Dash", "EEE");
        s.display();
        s.update();
        s.display();
    }
}
