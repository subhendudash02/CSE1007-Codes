package Lab_4;

import java.util.Scanner;

class Member {
    String name, address;
    int age, ph_no, salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, int ph_no, int salary, String address) {
        Scanner s = new Scanner(System.in);
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;
        this.salary = salary;
        this.address = address;
        System.out.print("Specialization: ");
        specialization = s.next();
    }
}

class Manager extends Member {
    String department;
    Manager(String name, int age, int ph_no, int salary, String address) {
        Scanner s = new Scanner(System.in);
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;
        this.salary = salary;
        this.address = address;
        System.out.print("Department: ");
        department = s.next();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Employee e = new Employee("Subhendu", 19, 86865, 45000, "India");
        e.printSalary();
        Manager m = new Manager("Rohit", 20, 56452, 35000, "India");
        m.printSalary();
    }
}
