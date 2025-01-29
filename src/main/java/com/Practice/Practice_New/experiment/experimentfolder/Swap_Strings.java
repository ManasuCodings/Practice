package com.Practice.Practice_New.experiment.experimentfolder;

public class Swap_Strings {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="world";

        System.out.println("before swapping String is : " + s1+" "+ s2);
        swapString(s1,s2);

    }

    private static void swapString(String s1, String s2) {
        //swapping without using third variable
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println("after swapping String is: "+s1+" "+s2);


    }
}
