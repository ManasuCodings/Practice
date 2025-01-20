package com.Practice.Practice_New.experiment.experimentfolder;

public class Mutablity_String {

    public static void main(String[] args) {
        String s1="hello";
        String s2=s1;

        s1="world";
        System.out.println(s1);
        System.out.println(s2);
    }
}
