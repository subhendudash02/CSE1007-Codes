package Multithreading;

public class extending_thread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        extending_thread obj = new extending_thread();
        obj.start();
    }
}
