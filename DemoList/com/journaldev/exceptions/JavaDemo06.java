package com.journaldev.exceptions;

import java.util.Date;

class subThreadTest1 implements Runnable {
    @Override
    public void run() {
        Strshow();
    }
    public synchronized void Strshow(){
        for (int x = 0; x < 100; x++) {
            if (x % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " x = " + x +"--->"+ new Date(System.currentTimeMillis()) );
            }

        }
    }
}

class subThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            if (j % 2 != 0) {
                System.out.println(Thread.currentThread().getName()  + " j = " + j + "--->"+new Date(System.currentTimeMillis()));
            }

        }
    }
}

public class JavaDemo06 {
    public static void main(String[] a) {
        subThreadTest2 stt = new subThreadTest2();
        new Thread(stt,"线程A").start();
        new Thread(stt,"线程B").start();
       ;
//        Thread.currentThread().interrupt();
//        try {
//            td1.interrupt();
//        }catch (Exception e){
//           System.out.println(e);
//        }
//        System.out.println("子线程A 的状态:"+td1.getState());

//        Thread td2 = new Thread(new subThreadTest2());
//        td2.start();
//        td2.setName("子线程--->B");
//        System.out.println("子线程B 的状态："+td2.getState());
//
//        for (int x = 0; x < 10; x++) {
//            if (x % 2 == 0) {
//                System.out.println(Thread.currentThread().getName()+ " x = " + x +"--->"+ new Date(System.currentTimeMillis()));
//            }
//        }
//
//        for (int j = 0; j < 10; j++) {
//            if (j % 2 != 0) {
//                System.out.println(Thread.currentThread().getName()  + " j = "+ j+"--->"+ new Date(System.currentTimeMillis()));
//            }
//        }
//
   }
}

