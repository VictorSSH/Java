package com.journaldev.exceptions;

import java.util.Date;
import java.util.SplittableRandom;

class JoinThrelaRunnable implements  Runnable{
    private String name;
    private int pauseTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public JoinThrelaRunnable(String n, int x){
        name = n;
        pauseTime = x;
    }

    @Override
    public void run() {
        for (int j =0;j<20;j++){
            System.out.println(name+":"+" = "+j + new Date(System.currentTimeMillis()));
            try {
                Thread.sleep(pauseTime);
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
public class JavaDemo09 {
    public static void main(String[] a){
        Thread ta = new Thread(new JoinThrelaRunnable("Ïß³ÌA",1000));
        ta.start();
        System.out.println(ta.toString());

    }
}
