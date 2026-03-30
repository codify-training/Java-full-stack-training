package org.example.threads;


class Worker extends Thread{
    int i;
    public void run(){
        ThreadsDemo t = new ThreadsDemo();
        t.doProcess(i);
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
