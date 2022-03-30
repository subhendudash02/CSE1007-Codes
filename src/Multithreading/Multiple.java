package Multithreading;

public class Multiple implements Runnable {
    String name;
    Thread t;

    Multiple(String n) {
        name = n;
        t = new Thread(this, name);
        System.out.println("Target " + n);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi " + i);
        }
    }

    public static void main(String[] args) {
        new Multiple("1");
        new Multiple("2");
        System.out.println("Main thread exiting");
    }
}
