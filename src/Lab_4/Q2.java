package Lab_4;

import java.util.Scanner;

class Emp {
    String Emp_name;
    int Emp_id;
    String Address;
    String Mail_id;
    int Mobile_no;
    void display(){
        System.out.println("Name:"+Emp_name);
        System.out.println("Address:"+Address);
        System.out.println("ID:"+Emp_id);
        System.out.println("Mail:"+Mail_id);
        System.out.println("Ph.no:"+Mobile_no);
    }
}
class Programmer extends Emp {
    int BP;
    void display(){
        System.out.println("Salary:");
        System.out.println("BP:"+BP);
        System.out.println("DA:"+0.97*BP);
        System.out.println("HRA:"+0.10*BP);
        System.out.println("PF:"+0.12*BP);
        System.out.println("CLUB FUND:"+0.001*BP);

    }
}
class Research_Scholar extends Emp {
    int BP;
    void display(){
        System.out.println("Salary:");
        System.out.println("BP:"+BP);
        System.out.println("DA:"+0.97*BP);
        System.out.println("HRA:"+0.10*BP);
        System.out.println("PF:"+0.12*BP);
        System.out.println("CLUB FUND:"+0.001*BP);
        System.out.println("Consoidated Pay:20000");

    }
}
class Assistant_Professor extends Emp {
    int BP;

    void display(){
        System.out.println("Salary:");
        System.out.println("BP:"+BP);
        System.out.println("DA:"+0.97*BP);
        System.out.println("HRA:"+0.10*BP);
        System.out.println("PF:"+0.12*BP);
        System.out.println("CLUB FUND:"+0.001*BP);

    }
}
class Associate_Professor extends Emp {
    int BP;

    void display(){
        System.out.println("Salary:");
        System.out.println("BP:"+BP);
        System.out.println("DA:"+0.97*BP);
        System.out.println("HRA:"+0.10*BP);
        System.out.println("PF:"+0.12*BP);
        System.out.println("CLUB FUND:"+0.001*BP);

    }
}
class Professor extends Emp {
    int BP;

    void display(){
        System.out.println("Salary:");
        System.out.println("BP:"+BP);
        System.out.println("DA: "+0.97*BP);
        System.out.println("HRA: "+0.10*BP);
        System.out.println("PF: "+0.12*BP);
        System.out.println("CLUB FUND: "+0.001*BP);

    }
}
public class Q2{
    public static void main(String args[]){
        System.out.println("\n 1.Programmer\n2.Research_Scholar\n3.Assistant_Professor\n4.Associate_Professor\n5.Professor");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int ch=input.nextInt();
        switch (ch) {
            case 1:
                Emp e1=new Emp();
                Programmer p1=new Programmer();
                e1.Emp_name="Hari";
                e1.Address="y-city";
                e1.Mail_id="hari@gmail.com";
                e1.Emp_id=567;
                e1.Mobile_no=23478;
                p1.BP=20000;
                p1.display();
                e1.display();
                break;
            case 2:
                Emp e2=new Emp();
                Research_Scholar p2=new Research_Scholar();
                e2.Emp_name="Shri";
                e2.Address="Chennai";
                e2.Mail_id="shri@gmail.com";
                e2.Emp_id=666;
                e2.Mobile_no=81101;
                p2.BP=30000;
                p2.display();
                e2.display();
                break;

            case 3:
                Emp e3=new Emp();
                Assistant_Professor p3=new Assistant_Professor();
                e3.Emp_name="Rajan";
                e3.Address="A-city";
                e3.Mail_id="RAJAN@gmail.com";
                e3.Emp_id=123;
                e3.Mobile_no=98671;
                p3.BP=50000;
                p3.display();
                e3.display();
                break;
            case 4:
                Emp e4=new Emp();
                Associate_Professor p4=new Associate_Professor();
                e4.Emp_name="Mani";
                e4.Address="B-city";
                e4.Mail_id="MANI@gmail.com";
                e4.Emp_id=456;
                e4.Mobile_no=98710;
                p4.BP=75000;
                p4.display();
                e4.display();
                break;
            case 5:
                Emp e5=new Emp();
                Professor p5=new Professor();
                e5.Emp_name="KANNAN";
                e5.Address="Karur";
                e5.Mail_id="kanna@gmail.com";
                e5.Emp_id=789;
                e5.Mobile_no=98710;
                p5.BP=100000;
                p5.display();
                e5.display();
                break;
            case 6:
                //exit(1);

            default:
                System.out.println("enter correct choice");

        }
    }
}
