package Multithreading;

public class Multiple2 implements Runnable {
    String name;
    Thread t;

    Multiple2(String n) {
        name = n;
        t = new Thread(this, name);
        System.out.println("Target " + n);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " + i);
                t.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Multiple("1");
        new Multiple("2");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
