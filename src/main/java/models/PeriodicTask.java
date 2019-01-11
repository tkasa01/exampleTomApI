package main.java.models;

import java.util.TimerTask;

public class PeriodicTask extends TimerTask {

    @Override
    public void run(){
        System.currentTimeMillis();
        try{
            Thread.sleep(60 * 100000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
