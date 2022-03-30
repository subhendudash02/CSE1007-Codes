package Multithreading;

class Disp {
    synchronized public void disp(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n + " ");
        }
    }
}

class T1 extends Thread {
    public void run() {
        Disp d = new Disp();
        d.disp(10);
    }
}

class T2 extends Thread {
    public void run() {
        Disp d = new Disp();
        d.disp(20);
    }
}

public class synchronisation {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();
    }
}
