package com.Practice.Practice_New.experiment.experimentfolder;

public class Check_String_Contains_Only_Alphabet_Or_Digit {

    public static void main(String[] args) {
        String s1="abcd123";
        checkAlphabetOrDigit(s1);
    }

    private static void checkAlphabetOrDigit(String s1) {
        boolean isLetterOrDigit = s1.chars().allMatch(Character::isLetterOrDigit);
        if(isLetterOrDigit){
            System.out.println(s1+" contains letters or Digit");
        }
        else {
            System.out.println(s1+" don't contains letters or Digit");
        }
    }
}
