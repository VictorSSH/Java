package com.journaldev.exceptions;
import java.util.Date;

class TimePrinter implements Runnable{
    int pauseTime;
    String name;
    public TimePrinter(int x,String n){
        pauseTime=x;
        name=n;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(name + ":" + new Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class JavaDemo02 {
    public static void main(String[] a){
        /**
         * a**/
        TimePrinter runnable1 = new TimePrinter(1000,"Fast Guy");
         Thread t1 = new Thread(runnable1);
        t1.start();
        System.out.println(t1.getState());

        TimePrinter runnable2 = new TimePrinter(1000,"slow Guy");
        Thread t2 = new Thread(runnable2);
        t2.start();

//         Thread t1 = new Thread(new TimePrinter(1000,"Fast Guy"));
//         t1.start();
//         Thread t2 = new Thread(new TimePrinter(1000,"slow Guy"));
//         t2.start();
        while (true) {
            try {
                System.out.println( Thread.currentThread()+":" + new Date(System.currentTimeMillis()));
            }catch (Exception e){
                /****/
                System.out.println(e);
            }
        }
    }
}
