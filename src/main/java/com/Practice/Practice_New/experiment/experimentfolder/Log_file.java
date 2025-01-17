package com.Practice.Practice_New.experiment.experimentfolder;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;

public class Log_file {

    Timestamp timestamp;

    static TreeMap<Timestamp, String> map = new TreeMap<>();
    
    private  void addLog(String error, String info){
        timestamp = Timestamp.from(Instant.now());
        String message= "error : "+ error+" info :"+ info;
        map.put(timestamp, message);
        
    }

    private void reteriveALlLog(){
        for (Map.Entry<Timestamp, String> x: map.entrySet()) {

            System.out.println("time : "+x.getKey() +" Log :"+ x.getValue());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Log_file logFile = new Log_file();

        logFile.addLog("no error","code will execute");
        Thread.sleep(2000);

        logFile.addLog("no error","DataBase connected");
        Thread.sleep(2000);
        logFile.addLog("error","SQL Exception");
        Thread.sleep(2000);
        logFile.addLog("error","NUll pointer exception");

        logFile.reteriveALlLog();

    }
}
