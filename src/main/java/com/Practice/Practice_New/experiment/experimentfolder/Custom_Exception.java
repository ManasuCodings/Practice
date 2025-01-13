package com.Practice.Practice_New.experiment.experimentfolder;

public class Custom_Exception extends RuntimeException{

    public Custom_Exception(String mgs){
        System.out.println(mgs);
    }
    public boolean sum(){
        System.out.println(20+30);

        return false;
    }
}


