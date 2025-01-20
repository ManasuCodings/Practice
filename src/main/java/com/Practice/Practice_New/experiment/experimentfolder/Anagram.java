package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        String s1= "cbaebabacd";
        String s2="abc";

        List<Integer> ar=anagramIndexes(s1,s2);
        ar.forEach(System.out::println);
    }

    private static List<Integer> anagramIndexes(String s1, String s2) {

        ArrayList<Integer> result = new ArrayList<>();
        char[] ar1 = s2.toCharArray();

        //Frequency Map for s2
        HashMap<Character, Integer> s2FreqMap = new HashMap<>();
        for(int i=0; i<ar1.length; i++){
            s2FreqMap.put(ar1[i],s2FreqMap.getOrDefault(ar1[i],0)+1);
        }

        //Sliding window for s1
        HashMap<Character, Integer> windowFreqMap = new HashMap<>();
        int windowSize = s2.length();
        for (int i=0; i<s1.length(); i++){
            //Add current character to the window
            char currentCharacter = s1.charAt(i);
            windowFreqMap.put(currentCharacter,windowFreqMap.getOrDefault(currentCharacter,0) +1);

            // Remove character that's sliding out of the window
            /* Window Size:

            The size of the sliding window is equal to the length of s2 (windowSize).
            Condition i >= windowSize:

            The window starts expanding at index 0. When the index i becomes greater than or equal to windowSize, the window becomes too large, so the leftmost character (i.e., s1.charAt(i - windowSize)) needs to be removed.
            Removing or Decrementing the Frequency:

            If the frequency of the character to be removed is 1, that character is removed from windowFreqMap completely.
            Otherwise, the frequency of that character is decremented by 1.*/

            if(i>=windowSize){
                char charToRemove = s1.charAt(i - windowSize);
                if (windowFreqMap.get(charToRemove) == 1){
                    windowFreqMap.remove(charToRemove);
                }
                else{
                    //if there is no character or more character to remove then we will simply decrease the frequency of the window
                    windowFreqMap.put(charToRemove, windowFreqMap.get(charToRemove)-1);
                }
            }
            if(windowFreqMap.equals(s2FreqMap)){
                result.add(i - windowSize + 1);
            }

        }

        return result;
    }
}
