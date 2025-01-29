package com.Practice.Practice_New.experiment.experimentfolder;

public class Check_String_Contains_Only_Alphabet {

    public static void main(String[] args) {
        String s1="abcdf";
        checkAlphabet(s1);

    }

    private static void checkAlphabet(String s1) {

        boolean isAlphabet = s1.chars().allMatch(Character::isAlphabetic);
        if(isAlphabet){
            System.out.println(s1+" contains only alphabet");
        }
        else {
            System.out.println(s1+" don't contains only alphabet");
        }
    }
}
