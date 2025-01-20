package com.Practice.Practice_New.experiment.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public  interface functionalInterface {

//    public String village(String village);
    public int sum(int x, int y);

    default String name(String name){
       return "your name is :"+name;
    }

    default void age(){
        System.out.println("your age is 24");
    }

    default List<Integer> sum(int x){
        LinkedList<Integer> integers = new LinkedList<>();
        for (int j=0; j<=x; j++){
            integers.add(j);
        }
        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        return collect;
    }

    static void newName(String name){
        System.out.println("your new name is : "+name);
    }
}
