package com.Practice.Practice_New.experiment.java8;

import java.util.List;

public class Functional_Interface_impl{


    public static void main(String[] args) {
        functionalInterface f1 =(a,b)-> {return a*b;};// implementation of abstract method of functional interface
//      functionalInterface f1 =(a)-> {return a;};
//      String village= f1.village("Dharkiro");
//      System.out.println(village); // output Dharkiro

        int sum = f1.sum(8, 4);//using reference variable of functional interface accessing sum(int x, int y) method
        System.out.println(sum);
        String basu = f1.name("basu");//using reference variable of functional interface accessing name method
        System.out.println(basu);
        f1.age();//using reference variable of functional interface accessing age method
        List<Integer> sum1 = f1.sum(10);//using reference variable of functional interface accessing sum(int x) method
        System.out.println(sum1);
        functionalInterface.newName("Dev");//static method call by interface name
    }

}
