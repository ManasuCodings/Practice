package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SubString_count {
    public static void main(String[] args) {
        String s1="hello my name is Basu is";
        String subString="is";
        int count=subStringCount(s1,subString);
        System.out.println(count);

    }

    private static int subStringCount(String s1,String subString) {

        LinkedList<String> sb = new LinkedList<>();
        String[] ar = s1.trim().split(" ");
        Arrays.asList(ar).forEach(x->{
            if(x.equals(subString)){
                sb.add(x);
            }
        });

        return sb.size();

    }
}
