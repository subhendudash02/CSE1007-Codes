package Lab_3;

import java.util.Scanner;

class Employee {
    String name, dept, desg;
    int id;

    Employee(String name, int id, String dept, String desg) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.desg = desg;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Emp ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desg);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 47899, "Accounting", "Vice President");
        Employee e2 = new Employee("Mohan", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy" , 81774, "Manufacturing", "Engineer");
        e1.print();
        e2.print();
        e3.print();
    }
}
