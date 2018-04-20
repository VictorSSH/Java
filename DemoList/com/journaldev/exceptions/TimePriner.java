package com.journaldev.exceptions;

import java.util.Date;

/**
 *
 */
class demo01 extends Thread {
    int pauseTime;
    String name;

    /**
     *
     */
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(name + ";" + new
                        Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public demo01(int x,String n){
        pauseTime = x;
        name=n;
    }
}

public class TimePriner {
   public  static void main(String[] a){
        demo01 d = new demo01(1000,"Fast Guy");
        d.start();
        demo01 d1 = new demo01(3000,"Slow Guy");
        d1.start();
    }
}
