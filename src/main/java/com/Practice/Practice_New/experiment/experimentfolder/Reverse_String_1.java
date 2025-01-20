package com.Practice.Practice_New.experiment.experimentfolder;

public class Reverse_String_1 {
// write a java program to reverse a string without using any built in function
    public static void main(String[] args) {
        String s1= "java guide";// output ediug avaj

        for (int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }

    }
}
