package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Common_Element_between_2_list {

    public static void main(String[] args) {

//        USING retainALL method of Collection
//        -------------------------------------
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Integer> l2 = new ArrayList<>();
//
//        for(int i=0; i<10; i++){
//            l1.add(i);
//        }
//        for(int i=7; i<=10; i++){
//            l2.add(i);
//        }
//
//        l1.retainAll(l2);
//
//        System.out.println(l1);

//   USING STREAM API AND contains() METHOD OF LIST

//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Integer> l2 = new ArrayList<>();
//
//        for(int i=0; i<10; i++){
//            l1.add(i);
//        }
//        for(int i=7; i<=10; i++){
//            l2.add(i);
//        }
//        List<Integer> l3 = l1.stream().filter(l2::contains).collect(Collectors.toList());
//
//        System.out.println(l3);
//  USING Arrays.asList
//        List<Integer> l4 = Arrays.asList(3, 4, 5, 6);
//        List<Integer> l5 = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
//
//        List<Integer> collect = l4.stream().filter(l5::contains).collect(Collectors.toList());
//
//        System.out.println(collect);

        List<String> l1 = Arrays.asList("Basu", "rohan", "raj","mohit");
        List<String> l2 = Arrays.asList("Basu", "rohan");
        List<String> collect = l2.stream().filter(l1::contains).collect(Collectors.toList());


        System.out.println(collect);
    }
}