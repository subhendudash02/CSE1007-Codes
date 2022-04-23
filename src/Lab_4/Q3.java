package Lab_4;

import java.util.Scanner;
public class Q3 {
    String name,address;
    Double Balance;
    String accno;
    Q3(){
    }
    Q3(String name, String address, Double Balance){
        this.name=name;
        this.address=address;
        this.Balance=Balance;
    }
    void Create_Accno(int i){
        int k;
        k=1000;
        k=k+i;
        String g;
        g=Integer.toString(k);
        accno="BA"+g;
        System.out.println(accno);
    }
    void Display(){
        System.out.println("Name of the depositor: "+name);
        System.out.println("Address of the depositor:"+address);
        System.out.println("Balance in the account of the depositor:"+Balance);
    }
    void Withdraw(double amt){
        Balance=Balance-amt;
    }
    void Deposit(double amt){
        Balance=Balance+amt;
    }
    void Change_address(String s) {
        address = s;
    }
}
class SBI extends Q3{
    double interest=0.07;
    void Interest_Calculation(float time, Q3 b){
        double cpy;
        cpy=b.Balance;
        b.Balance=b.Balance+b.Balance*interest*time;
        System.out.println("If the account of the first depositor is in SBI: ");
        b.Display();
        b.Balance=cpy;
    }
}
class Axis extends Q3{
    double interest=0.085;
    void Interest_Calculation(float time,Q3 b){
        double cpy;
        cpy=b.Balance;
        b.Balance=b.Balance+b.Balance*interest*time;
        System.out.println("If the account of the first depositor is in Axis: ");
        b.Display();
        b.Balance=cpy;
    }
}
class HDFC extends Q3{
    double interest=0.09;
    void Interest_Calculation(float time,Q3 b){
        Double cpy;
        cpy=b.Balance;
        b.Balance=b.Balance+b.Balance*interest*time;
        System.out.println("If the account of the first depositor is in HDFC: ");
        b.Display();
        b.Balance=cpy;
    }
}
class def{
    public static void main(String args[]) {
        String nam,addr;
        Double bal;
        Q3 a[]=new Q3[30];
        Scanner c =new Scanner(System.in);
        Scanner t= new Scanner(System.in);
        int n,i,m;
        double amt;String h;
        System.out.println("Enter the number of depositors:");
        n=c.nextInt();
        System.out.println("Enter the information of the depositors:");
        for(i=0;i<n;i++){
            System.out.println("Name: ");
            nam=t.nextLine();
            System.out.println("Address: ");
            addr=t.nextLine();
            System.out.println("Balance: ");
            bal=c.nextDouble();
            a[i]=new Q3(nam,addr,bal);
        }
        System.out.println("The details of the first depositor:");
        a[0].Display();
        System.out.println("Enter the amount to be deposited for the first person:");
        amt=c.nextDouble();
        a[0].Deposit(amt);
        System.out.println("The updated information:");
        a[0].Display();
        System.out.println("Enter the amount to be withdrawed for the first person:");
        amt=c.nextDouble();
        a[0].Withdraw(amt);
        System.out.println("The updated information:");
        a[0].Display();
        System.out.println("Enter the address to be changed for the first person:");
        h=t.nextLine();
        a[0].Change_address(h);
        System.out.println("The updated information:");
        a[0].Display();
        System.out.println("Enter the time period of depositing");
        m=c.nextInt();
        SBI x=new SBI();
        x.Interest_Calculation(m, a[0]);
        Axis y=new Axis();
        y.Interest_Calculation(m, a[0]);
        HDFC z=new HDFC();
        z.Interest_Calculation(m, a[0]);
    }
}