package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1,"raj");
        hm1.put(2,"rohit");
        hm1.put(3,"mohit");
        hm1.put(4,"amit");

        for (Entry<Integer,String> entry:hm1.entrySet()){
            System.out.println("roll no "+entry.getKey()+" is  "+entry.getValue());
        }
        for (int i=0; i<=hm1.size(); i++){
            System.out.println(hm1.get(i));
        }
        Set<Integer> keys = hm1.keySet();
        for (Integer k:keys) {
            System.out.println(k);
        }
        Collection<String> values = hm1.values();
        for (String s1: values) {
            System.out.println(s1);
        }
    }
}
