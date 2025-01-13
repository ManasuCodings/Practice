package com.Practice.Practice_New.experiment.experimentfolder;

public class Reverse_Each_Word_Of_String {

    public static void main(String[] args) {
//        String str="hello I am basu";
//
//        String[] ob1 = str.split(" ");
//
//        String s1="";
//
//
//        for (int i=0; i<ob1.length; i++ ){
//            if (str != " ") {
//                char[] charArray = ob1[i].toCharArray();
//                for (int j=charArray.length-1; j>=0; j--){
//                    s1=s1+charArray[j];
//                }
//            }
//            s1=s1+" ";
//        }
//        System.out.println(s1);
//--------------------------------------
        String str="hello I am basu";

        String[] ob1 = str.split(" ");

        StringBuilder sb1 = new StringBuilder();

        for (int i=0; i<ob1.length; i++ ){

            if (!str.trim().isEmpty()){
                StringBuilder sb2 = new StringBuilder(ob1[i]);
                sb1=sb1.append(sb2.reverse()).append(" ");
            }

        }
        System.out.println(sb1.toString().trim());
    }
}
