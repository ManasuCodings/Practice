package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalizing_firstLetter_of_String_List {

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("basu", "dev", "tewary");
        List<String> collect = l1.stream().map(x -> x.substring(0,1).toUpperCase() + x.substring(1, x.length())).collect(Collectors.toList());
        System.out.println(collect);
    }
}
