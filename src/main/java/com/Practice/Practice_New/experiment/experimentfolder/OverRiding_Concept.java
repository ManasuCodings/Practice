package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.List;

class Parent{

    public void walk(){
        System.out.println("parent is walking");
    }
    public void run(){
        System.out.println("parent is running");
        walk();
    }
}
class Child extends  Parent{
    public void walk(){
        System.out.println("child is walking");
        super.walk();
    }
    public void run(){
        System.out.println("child is running");
        super.run();
    }
}
public class OverRiding_Concept {

    public static void main(String[] args) {
        Parent ob1= new Child();
        ob1.run();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer integer = list.stream().filter(x -> x % 2 != 0).map(x -> x * x).reduce(Integer::sum).get();
        System.out.println(integer);
    }

}
