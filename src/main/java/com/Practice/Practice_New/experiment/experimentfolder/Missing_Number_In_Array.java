package com.Practice.Practice_New.experiment.experimentfolder;

public class Missing_Number_In_Array {

//    {2, 4, 1, 3, 7, 6} find the missing number in the element
//    missing number is 5

    public static void main(String[] args) {
        int[] arr= {2, 4, 1, 3, 7, 6};

        int mn=missingNumber(arr);
        System.out.println(mn);
    }

    private static int missingNumber(int[] arr) {
        //include missing number
        int n=arr.length + 1;
        // below is the formula for finding missing number (n * (n+1))/2;
        int expectedSum=(n * (n+1))/2;

        int actualSum=0;

        for(int i=0; i<arr.length;i++){
            actualSum+=arr[i];
        }
        // and here is the missing number that is the difference between expectedSum and actualSum.
        int i = expectedSum - actualSum;

        return i;
    }


}
