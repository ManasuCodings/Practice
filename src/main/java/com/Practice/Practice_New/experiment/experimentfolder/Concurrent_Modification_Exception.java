package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Concurrent_Modification_Exception {


    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

//  Iterator is designed in such a way  that when we use remove method of iterator it will remove the item from
//  the underlying implementation in this case iterator is getting implemented using list li we could also use
//  Hashmap or other collect with iterator it will remove the collection element when we call remove element of
//  Iterator

//        HashMap<Integer, String> hm = new HashMap<>();
//        Iterator<Map.Entry<Integer, String>> iterator1 = hm.entrySet().iterator();
//        iterator1.remove();

        Iterator<Integer> iterator = li.iterator();

        while(iterator.hasNext()){
           Integer i= iterator.next();
            System.out.println(i);

           if(i.equals(2)){
               iterator.remove();
           }
        }

        System.out.println(li);
    }
}
