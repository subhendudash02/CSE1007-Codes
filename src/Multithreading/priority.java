package Multithreading;

public class priority extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        priority p1 = new priority();
        priority p2 = new priority();
        p1.start();
        p2.start();
    }
}
