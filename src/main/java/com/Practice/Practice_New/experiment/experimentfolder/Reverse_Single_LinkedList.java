package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.LinkedList;

public class Reverse_Single_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<Integer> reverseList= reverseSingle_LinkedLIst(integers);
    }

    private static LinkedList<Integer> reverseSingle_LinkedLIst(LinkedList<Integer> li) {

        for(Integer i=1; i<10; i++){

            li.add(i);
        }
        for (int i=li.size()-1; i>=0; i--){
            System.out.print(li.get(i)+" ");
        }
        return null;
        
    }
}
