package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Map;
import java.util.stream.Collectors;

public class Character_Occurance_Count {

    public static void main(String[] args) {
        String s1="basudev";
        countChar(s1);
    }

    private static void countChar(String s1) {

        Map<Character, Long> collect = s1.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("character Occurance as below: ");
        for (Map.Entry<Character,Long> entries:collect.entrySet()) {
            System.out.println(entries.getKey()+" , "+entries.getValue());
        }

    }

}
