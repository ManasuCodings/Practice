package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Trim_method {

    public static void main(String[] args) {
//        String s1="tanu  ";
//        s1.trim();
//        System.out.println(s1);
//
//

//        int x=10;
//        int y=20;
//
//        int z=x++ +y;// x will be increased after getting used so z=30 but during assigning it to z it will be 10
//        System.out.println(z);//30

//        int[] ar={3,4,5,7,2,6,8,10};
//        List<int[]> list = Arrays.asList(ar);
//        int y=0;

        int[] ar={14,12,15,10,27,21,20,25,22,23,24,26,29,32,33,35,38,40,16,2,28,30,13,9,11,8,18,34,5,7,6,37,36,3,4,1,39,17};
        System.out.println(ar.length);
        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate elements:");

        for (int num : ar) {
            if (!seen.add(num)) { // If add returns false, it's a duplicate
                System.out.println(num);
            }
        }


    }
}
