package com.Practice.Practice_New.experiment;

import org.json.JSONObject;

import java.util.*;

public class Fetch_UniqueKeyfromJsonObject {

    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        
        jsonObject.put("1","basu");
        jsonObject.put("2","Dev");
        jsonObject.put("3","Tewary");
        jsonObject.put("3","kumar");
        jsonObject.put("1","mohit");

        System.out.println("unique keys are: "+jsonObject.keySet().toString());
    }
    }
