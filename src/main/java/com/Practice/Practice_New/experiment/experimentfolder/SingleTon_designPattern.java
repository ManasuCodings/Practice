package com.Practice.Practice_New.experiment.experimentfolder;

public class SingleTon_designPattern {

    private SingleTon_designPattern(){

    }

    private static SingleTon_designPattern ob1;

    public static SingleTon_designPattern getInitialization(){

        if(ob1==null){
            ob1=new SingleTon_designPattern();
        }
        return ob1;
    }
}
