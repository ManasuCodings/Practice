package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicate_From_String {
    public static void main(String[] args) {
        String s1="hello my name is Basu is";

        removeDuplicate(s1);
    }

    private static void removeDuplicate(String s1) {
        String[] word = s1.trim().split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (String s2:word) {
            set.add(s2+" ");
        }
        set.forEach(System.out::print);

    }

}
