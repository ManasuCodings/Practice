package com.Practice.Practice_New.experiment.experimentfolder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {


    public static void main(String[] args) {
        //created 10 thread in  thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //assigning each thread a unique task for giving salary to unique employee
        for(int i=1; i<=10; i++){

            int employeeId=i;
            executorService.submit(()-> {
                    paySalary(employeeId);
            });
        }
        executorService.shutdown();

    }

    private static void paySalary(int employeeId) {
        System.out.println("paying to employee "+employeeId+" "+ Thread.currentThread().getName());

        System.out.println("paid to Employee " + employeeId + " " + Thread.currentThread().getName());

    }
    /*
        FEATURE | EXECUTE  | SUBMIT
        Return Type->void  | Future
        Task Type->Runnable only |Runnable or Callable
        Exception Handling->Uncaught exception handler | Captured in Future and rethrown
        Use Case-> Fire-and-forget|	Retrieve results or handle exceptions

        When to Use?
        EXECUTE: Use when you don't care about the result or exception (fire-and-forget).
        SUBMIT: Use when you need to track the task's progress, retrieve the result, or handle exceptions explicitly.
     */


}
