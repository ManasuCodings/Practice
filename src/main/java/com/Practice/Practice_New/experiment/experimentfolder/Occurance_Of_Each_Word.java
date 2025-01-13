package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurance_Of_Each_Word {

    public static void main(String[] args) {
        String s1= "my name is basudev and I live in dhanbad and my friend name is also basudev and he also live in dhanbad";
        String[] words = s1.split(" ");
        Map<String, Long> collect = Arrays.asList(words).stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));

//        collect.forEach((word,count) -> System.out.println(word+ " "+ count));
        for (Map.Entry<String, Long> nm: collect.entrySet()){
            System.out.println(nm.getKey()+" -- "+nm.getValue());
        }
//
//        String s1="basudev";
//        char[] charArray = s1.toCharArray();
//        Map<char[], Long> collect = Arrays.asList(charArray).stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        collect.forEach((ch, count)-> System.out.println(ch+" "+count));
//
//        for (Map.Entry<char[], Long> nm:collect.entrySet()){
//            System.out.println(nm.getKey()+" -- "+nm.getValue());
//        }
//        String[] s = s1.split(" ");
//        Map<String, Long> collect = Arrays.asList(s).stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        collect.forEach((word, count)-> System.out.println(word+" "+count));
    }
}
