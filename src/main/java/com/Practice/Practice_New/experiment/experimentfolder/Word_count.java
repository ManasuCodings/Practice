package com.Practice.Practice_New.experiment.experimentfolder;

public class Word_count {
    public static void main(String[] args) {
        String s1="hello my name is Basu";

        int count=wordCount(s1);
        System.out.println(count);
    }

    private static int wordCount(String s1) {
        String s2 = s1.trim();
        String[] ar = s2.split(" ");
        return ar.length;
    }
}
