package org.example.corejavasamples.threads;

class CoWorker{}
class MyTask implements Runnable{

    int taskId;
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Task - "+taskId);
    }

}
public class MultiThreadWithRunnable {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0; i<=10; i++){
            MyTask task = new MyTask();
            task.taskId = i;
            Thread t1 = new Thread(task);
            t1.start();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken : "+ (end - start));
    }

}
