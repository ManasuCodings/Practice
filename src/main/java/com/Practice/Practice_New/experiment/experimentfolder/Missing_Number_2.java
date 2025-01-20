package com.Practice.Practice_New.experiment.experimentfolder;

public class Missing_Number_2 {

    public static void main(String[] args){
        //input ={1,2,4,6,3,7,8} , output:5
        int[] ar={1,2,4,6,3,7,8};
        int n=ar.length+1;

        //missing number formula difference of total expected sum - total actual sum
        int expected_sum=0;
        int actual_sum = (n*(n+1)/2);
        for (int i=0; i<ar.length; i++){
            expected_sum+=ar[i];
        }
        int missing_num= actual_sum - expected_sum;
        System.out.println(missing_num);
    }
}
