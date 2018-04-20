package com.journaldev.exceptions;

import java.util.Date;

class JavaDemoRunnable implements Runnable {
    private String name;
//    public String
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+";"+"="+i+ new Date(System.currentTimeMillis()));
        }
    }

    @Override
    public String toString() {
        return "JavaDemoRunnable{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class JavaDemo08 {
    public static void main(String[] a){
        Thread td= new Thread(new JavaDemoRunnable());
        td.setName("Ïß³ÌA");
        td.start();
        td.toString();
    }
}
