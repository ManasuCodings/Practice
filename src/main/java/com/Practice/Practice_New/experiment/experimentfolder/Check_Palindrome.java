package com.Practice.Practice_New.experiment.experimentfolder;

public class Check_Palindrome {
    public static void main(String[] args) {
//        s1="level", output= true else false
        String s1="magic";
        boolean b1=true;

        for(int i=0,j=s1.length()-1; i<s1.length() && j>0; i++,j-- ){
            if(s1.charAt(i) != s1.charAt(j)){
                b1=false;
                break;
            }

        }
        if (b1){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
