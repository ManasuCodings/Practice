package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter you name");
        String name = scanner.nextLine();
        System.out.println("enter your address");
        String address = scanner.nextLine();
        System.out.println("tell me about your self");
        String yourself = scanner.nextLine();
        System.out.println(name+ " "+ address+" "+yourself);

    }
}
