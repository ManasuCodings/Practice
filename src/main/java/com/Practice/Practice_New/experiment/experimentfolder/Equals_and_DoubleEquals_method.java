package com.Practice.Practice_New.experiment.experimentfolder;

public class Equals_and_DoubleEquals_method {



    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3= new String("abc");
        String s4= new String("abc");

        String s5="hello";
        s5= s5+"basu";
        System.out.println(s5);
        Integer i=123;
        Integer j=123;

        System.out.println(i==j);
        System.out.println(i.equals(j));

        System.out.println("--------------------------------------------");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);

        System.out.println("____________________________________________");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s2));

    }
}
