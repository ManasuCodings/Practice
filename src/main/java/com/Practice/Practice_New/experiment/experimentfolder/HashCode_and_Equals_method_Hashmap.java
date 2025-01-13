package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.HashMap;

public class HashCode_and_Equals_method_Hashmap {

    static HashMap_Equals_and_Hashcode_Employee a1 =    new HashMap_Equals_and_Hashcode_Employee("basu",21,"sde1", 50000L);
    static HashMap_Equals_and_Hashcode_Employee b1 =    new HashMap_Equals_and_Hashcode_Employee("basu",21,"sde1", 50000L);
    static HashMap_Equals_and_Hashcode_Employee c1 =    new HashMap_Equals_and_Hashcode_Employee("basu",21,"sde1", 50000L);
    static HashMap_Equals_and_Hashcode_Employee d1 =    new HashMap_Equals_and_Hashcode_Employee("basu",21,"sde1", 50000L);

    public static void main(String[] args) {
        HashMap<HashMap_Equals_and_Hashcode_Employee, String> hmap = new HashMap<>();
        hmap.put(a1, "first");
        hmap.put(b1, "second");
        hmap.put(c1, "third");
        hmap.put(d1, "fourth");

        System.out.println(hmap.size());

        System.out.println(d1.toString());
    }

}
