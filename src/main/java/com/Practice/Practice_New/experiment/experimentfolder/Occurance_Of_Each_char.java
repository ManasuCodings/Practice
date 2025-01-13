package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Map;
import java.util.stream.Collectors;

public class Occurance_Of_Each_char {

    public static void main(String[] args) {
        String s1="mukul";
        Map<Character, Long> collect = s1.chars()//converting string to int stream of Ascii
                .mapToObj(x -> (char) x)//convering int stream to character stream
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));//grouping each common character and counting them
        collect.forEach((ch,count)-> System.out.println(ch+" "+count));
    }

}
