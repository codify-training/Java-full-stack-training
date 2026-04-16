package org.example.corejavasamples.threads;

class CommonWorker{}

class Worker extends Thread{
    int i;
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Task - "+i);
    }
}

public class ExtendingThreadDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i=1; i<10; i++){
            Worker w1 = new Worker();
            w1.i = i;
            w1.start();
         }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken : "+ (end - start));
    }

}
