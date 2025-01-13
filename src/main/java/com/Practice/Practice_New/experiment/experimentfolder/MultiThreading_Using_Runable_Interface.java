package com.Practice.Practice_New.experiment.experimentfolder;

public class MultiThreading_Using_Runable_Interface implements Runnable{

    private String name;

    public MultiThreading_Using_Runable_Interface(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(name);

        }
    }

    public static void main(String[] args) {
        MultiThreading_Using_Runable_Interface ob1 = new MultiThreading_Using_Runable_Interface("abc");
        MultiThreading_Using_Runable_Interface ob2 = new MultiThreading_Using_Runable_Interface("mxv");
        MultiThreading_Using_Runable_Interface ob3 = new MultiThreading_Using_Runable_Interface("xyz");

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        Thread t3 = new Thread(ob3);
        t1.start();
        t2.start();
        t3.start();
    }


}
