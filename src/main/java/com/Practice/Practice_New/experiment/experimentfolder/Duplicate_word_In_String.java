package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_word_In_String {

    public static void main(String[] args) {
        String s1="hello my name is hello my bro is";
        String s2=findDuplicateWord(s1);
        System.out.print(s2);

    }

    private static String findDuplicateWord(String s1) {
        String[] ar1 = s1.split(" ");
        List<String> list = Arrays.asList(ar1);
        StringBuilder sb = new StringBuilder();
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("duplicate words are as follows:");
        for (Map.Entry<String, Long> entries:collect.entrySet()) {

            if(entries.getValue()>1){
               sb.append(entries.getKey()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
