package Lab_5;

import java.io.*;
import java.util.Scanner;
abstract public class Q2 {
    int Roll_no;
    String Name;
    public int subject_1_mark;
    abstract void Show_student_data();
    void Get_student_data(
            int roll, String nam,int subj_1_mar){
        Roll_no=roll; Name=nam; subject_1_mark=subj_1_mar;
    }
}
interface Sport{
    int sport_grace_marks=5;
    public void Show_sport_mark();
}
interface NCC{
    int NCC_grace_marks=10;
    public void Show_NCC_mark();
}
class Result extends Q2 implements Sport,NCC{
    int Total_marks;
    void Show_student_data(){
        System.out.println("Name: "+Name);
        System.out.println("Roll No:"+Roll_no);
        System.out.println("Subject 1 mark:"+subject_1_mark);
    }
public void Show_sport_mark(){ System.out.println(sport_grace_marks); }
    public void Show_NCC_mark(){ System.out.println(NCC_grace_marks); }
    void Show_result(){
    Total_marks=subject_1_mark+sport_grace_marks+NCC_grace_marks;
    System.out.println(Total_marks);
    }
}
class main_4{
    public static void main(String args[]){
        String nam;
        int roll,subject_1mark;
        Scanner t=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the details of the student: ");
        System.out.println("Name: ");
        nam=t.nextLine();
        System.out.println("Roll No: ");
        roll=c.nextInt();
        System.out.println("Mark of subject 1: ");
        subject_1mark=t.nextInt();
        Result s=new Result();
        s.Get_student_data(roll, nam, subject_1mark);
        System.out.println("The data entered: ");
        s.Show_student_data();
        System.out.println("Sports mark obtained: ");
        s.Show_sport_mark();
        System.out.println("NCC marks obtained: ");
        s.Show_NCC_mark();
        System.out.println("Total marks obtained: ");
        s.Show_result();
    }
}