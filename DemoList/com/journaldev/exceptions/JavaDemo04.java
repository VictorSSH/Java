package com.journaldev.exceptions;

import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * 通过使用Runnable接口实现多线程
 */
class PrimeThread implements Runnable {
    String name;
    int Time;
    int Pro;

    public PrimeThread(String n, int x) {
        name = n;
        Time = x;
    }

    /**
     * 重写run()方法，run()方法线程的执行体
     */
    @Override
    public void run() {
        for (int y = 0; y < 10; y++)
            try {
                System.out.println("当前线程正在执行的线程对象引用：" +
                        /**
                         * 返回对当前正在执行的线程对象的引用
                         */
                        Thread.currentThread().getPriority() + "线程执行名称" +
                        name + "\tSystem Time:" +
                        /**
                         * 调用系统时间
                         */
                        new Date(System.currentTimeMillis()));
                Thread.sleep(Time);
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}

public class JavaDemo04 {
    public static void main(String[] a) {
        PrimeThread pt1 = new PrimeThread("this is my Thread name", 1000);
        Thread td1 = new Thread(pt1);
        td1.start();
        td1.interrupt();
        boolean k = td1.isAlive();
        System.out.println(k);
        td1.setPriority(10);
    }
}
