package com.Practice.Practice_New.experiment.experimentfolder;

public class ThreadClass extends Thread {

    @Override
    public void start() {
        // we are calling native start method by using super().start() and this will help in creating new thread and
        //calling run method on that thread after start() got executed

        //note: if we do not call super().start() explicitly then no new thread will be created and no run method got called only
        // overriden start() will get executed.
        System.out.println("thread started in start method:"+ Thread.currentThread().getName());
        super.start();
    }

    @Override
    public void run() {
        System.out.println("thread started in run method:"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.setName("thread1");
        t1.start();
        t1.run();
        System.out.println("thread started in main method:"+ Thread.currentThread().getName());

    }
}
