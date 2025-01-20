package com.Practice.Practice_New.experiment.experimentfolder;

public class Merge_2_Sorted_Array {

    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int[] ar2={6,7,8,9,10};//output {1,2,3,4,5,6,7,8,9,10}

        int[] ar3= new  int[ar.length+ar2.length];
        int i=0,j=0,k=0;

        while(i<ar.length && j<ar2.length){
            if(ar[i]<ar2[j]){
                ar3[k++]=ar[i++];
            }
            else {
                ar3[k++]=ar2[j++];
            }

        }
        while(i<ar.length){
            ar3[k++]=ar[i++];
        }
        while (j<ar2.length){
            ar3[k++]=ar2[j++];
        }
        for (int x:ar3) {
            System.out.print(x+" ");
        }
    }
}
