package Lab_5;

import java.io.*;
import java.util.Scanner;

abstract public class Q1{
    abstract float getPercentage();
}

class A extends Q1{
    float a,b,c,percent;
    A( float a, float b, float c){
        this.a=a; this.b=b; this.c=c;
    }
    float getPercentage(){
        percent=((a+b+c)/300)*100;
        return percent;
    }
}
class B extends Q1{
    float a,b,c,d,percent;
    B(float a, float b, float c,float d){
    this.a=a; this.b=b; this.c=c;
    }
    float getPercentage(){
        percent=((a+b+c+d)/400)*100;
        return percent;
    }
}
class main_3{
    public static void main(String args[]){
        float a,b,c,d,result1,result2;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the marks of student A:");
        a=x.nextFloat();
        b=x.nextFloat();
        c=x.nextFloat();
        A a1=new A(a,b,c);
        result1=a1.getPercentage();
        System.out.println("Enter the marks of student B:");
        a=x.nextFloat();
        b=x.nextFloat();
        c=x.nextFloat();
        d=x.nextFloat();
        B b1=new B(a,b,c,d);
        result2=b1.getPercentage();
        System.out.println("The percentage of Student A:"+result1);
        System.out.println("The percentage of Student B:"+result2);
    }
}