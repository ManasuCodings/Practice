package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.HashMap;


public class TargetElement {

    public static void main(String[] args) {
        int[] ar={2, 7, 4, 1, 5, 3, 6, 8};
        int target = 9;

        TargetElement.targetSum(ar,target);
    }

    private static void targetSum(int[] ar, int target) {

//      targetElement = requiredElement + currentIndexOfArray

//        HashMap<Integer, Integer> map = new HashMap<>();
//        int requiredElement;
//
//        for(int i=0; i<ar.length; i++){
//            requiredElement= target -ar[i];
//            //now if requiredElement is already present in map than we will simply
//            //print the value of current key and  current index
//
//            if (map.containsKey(requiredElement)){
//                System.out.println("index are "+ map.get(requiredElement)+", " + i);
//            }
//            map.put(ar[i],i);
//        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<ar.length; i++){
            int requiredElement= target - ar[i];


            if(map.containsKey(requiredElement)){
                System.out.println("indexes are "+ map.get(requiredElement)+" and "+ i);
            }
            map.put(ar[i],i);
        }
    }
}
