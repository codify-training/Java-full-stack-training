package org.example.threads;

public class ThreadsDemo {

    public void doProcess(int i){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Task - "+i);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ThreadsDemo demo = new ThreadsDemo();
        for(int i=1; i<10; i++){
            demo.doProcess(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken : "+ (end - start));
    }

}
