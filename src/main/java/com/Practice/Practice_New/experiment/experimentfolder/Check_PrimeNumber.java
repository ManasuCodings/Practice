package com.Practice.Practice_New.experiment.experimentfolder;

public class Check_PrimeNumber {

    public static void main(String[] args) {
        int num=2;

        boolean isPrime= isPrimeNum(num);
        System.out.println(isPrime);
    }

    private static boolean isPrimeNum(int num) {
        boolean isPrime= true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
             isPrime =false;
             break;
            }
        }
        return isPrime;
    }
}
