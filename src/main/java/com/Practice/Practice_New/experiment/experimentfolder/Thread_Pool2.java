
package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);


        for(int i=1; i<=10; i++){
            int roll_no=i;
            executorService.execute(()->{
                System.out.println("roll no "+ roll_no);
            });
        }
        executorService.shutdown();
    }
}
