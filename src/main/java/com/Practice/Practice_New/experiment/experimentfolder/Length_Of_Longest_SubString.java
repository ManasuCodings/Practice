package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.HashSet;

public class Length_Of_Longest_SubString {

// we can get Longest Substring length using sliding window algorithm where we will take 2 node
//    left and right , we will expand the collection from right index to add new element and shrink the
//    array  from left(starting index) side index   if we got any matching element  by removing the left index element
    public static void main(String[] args) {

        String s1="ababbb";
        int longestLength= LongestLength(s1);
        System.out.println(longestLength);
    }

    private static int LongestLength(String s) {
        //we are taking hashSet because we do not want repeated char in the substring

        HashSet<Character> set = new HashSet<>();

        int left=0;
        int maxLength=0;//we will return the max length of substring

        //taking variable right and expanding the collection by adding the value
        for (int right=0; right<s.length(); right++){

            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));//we will shrink the window by removing the element from left side
                left++; // and increase the left by one
            }

            set.add(s.charAt(right));//adding the current character in the set

            maxLength = Math.max(maxLength,right-left+1);// calculating the longest substring length by subtracting right(end) index - left(start) index (included 1 that is including the last index means end index)
        }
        return maxLength;

    }
//    public static void main(String[] args) {
////      String s1="abcabcbb" output: 3 because longest sub string is abc
//        String s1="abcbbcbb" ;
//
//        int longestLength= findLongestSubstring(s1);
//        System.out.println(longestLength);
//
//
//    }
//
//    private static int findLongestSubstring(String s1) {
//
////     to store unique character that is without repeating  the char we will take hashSet()
//
//        HashSet<Character> set = new HashSet<>();
//        int left=0;//starting index
//        int maxLength=0;// for max length of substring
//
//        for (int right=0; right<s1.length(); right++){
//            // if character at right pointer already exists in the set, remove characters from left
//            while (set.contains(s1.charAt(right))){
//                set.remove(s1.charAt(left));
//                left++;
//
//            }
//            //add the current character in set
//            set.add(s1.charAt(right));
//            //update the maximum length
//            maxLength = Math.max(maxLength, right - left + 1);
//
//        }
//        return maxLength;
//    }
}
