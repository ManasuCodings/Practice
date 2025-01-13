package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddNumber_Addition_UsingStreamApi {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        below is sum of all integer in list
//        int sum = l1.stream().mapToInt(x -> (int) x).sum();
//        System.out.println(sum);
        //below is finding all even elements in the list and then printing them using foreach of stream api
//        List<Integer> collect = l1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        collect.stream().forEach((x)-> System.out.print(x+" "));
//        //below is the sum of all even number
//        Integer integer = l1.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).get();
//        System.out.println("\n"+integer);

        //below is the square of all even element of list and then sum it
        Integer integer = l1.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(Integer::sum).get();
        System.out.println(integer);

//        int j=0;
//        Integer integer = l1.stream().filter(x -> x % 2 == 0).map(x -> j + x).reduce(Integer::sum).get();
//        System.out.println(integer);
//        below stream is for adding the odd number in list using stream api and reduce method
//        ___________________________________
//        Integer oddSum = l1.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).get();
//        System.out.println(oddSum);

//        now make a square of each odd number then add those number using stream api
//
//        Integer oddSquare = l1.stream().filter(x -> x % 2 != 0).map(x -> x * x).reduce(Integer::sum).get();
//
//        System.out.println(oddSquare);
//
//        Set<Integer> s1= new HashSet<>();
//        Set<Integer> s2= new HashSet<>();
//        s1.add(1);
//        s1.add(2);
//        s1.add(3);
//        s1.add(4);
//        s2.add(5);
//        s2.add(2);
//        s2.add(3);
//        s2.add(1);
//        int i=0;
//        // found all the common elements between two sets and then add those number
//        Integer reduce = s1.stream().filter(s2::contains).map(x -> i + x).reduce(0, Integer::sum);
//        Set<Integer> collect = s1.stream().filter(s2::contains).collect(Collectors.toSet());
//        System.out.println(collect);
//        System.out.println(reduce);

    }
}
