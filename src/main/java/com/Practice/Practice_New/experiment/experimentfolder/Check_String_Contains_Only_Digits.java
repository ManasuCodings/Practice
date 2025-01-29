package com.Practice.Practice_New.experiment.experimentfolder;

public class Check_String_Contains_Only_Digits {

    public static void main(String[] args) {

        String s1="12345a";
        checkOnlyDigit(s1);
    }

    private static void checkOnlyDigit(String s1) {

        if(s1.chars().allMatch(Character::isDigit)){
            System.out.println(s1+" contains only digit");
        }
        else {
            System.out.println(s1+" don't contains only digits");
        }
    }
}
