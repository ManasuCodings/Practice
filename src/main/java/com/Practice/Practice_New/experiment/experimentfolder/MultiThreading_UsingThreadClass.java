package com.Practice.Practice_New.experiment.experimentfolder;

public class MultiThreading_UsingThreadClass extends Thread {
    private  String  name;
    public MultiThreading_UsingThreadClass(String msg){
        this.name=msg;

    }

    @Override
    public void run(){
        for(int i=1; i<20; i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        MultiThreading_UsingThreadClass ob1 = new MultiThreading_UsingThreadClass("abc");
        MultiThreading_UsingThreadClass ob2 = new MultiThreading_UsingThreadClass("xyz");
        MultiThreading_UsingThreadClass ob3 = new MultiThreading_UsingThreadClass("raju");
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
