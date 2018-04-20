package com.journaldev.exceptions;

import java.util.Date;

/**
 * 通过继承Thread类创建多线程
 */
class myThread extends Thread {
    private int x;

    /**
     * 重写run()方法，run()方法的方法体就是线程的执行体
     */
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            /**
             * 1，当线程继承Thread类时,直接使用this即可获取当前线程
             * 2,Thread对象的getName()返回当前线程的名字，
             * 3, 因此可以直接调用getName()方法返回当前线程的名称
             */
            System.out.println("--->this is Thread ID: " +
                    /**
                     *该方法返回线程的ID标识符
                     */
                    getId() + "--> Thread name:" +
                    /***
                     * 该方法返回线程的名称
                     */
                    getName() + "--->The array of stack trace elements of the stack dump "+
                    /***
                     *  返回表示此线程的堆栈转储的堆栈跟踪元素的数组
                     */
                    getStackTrace()+"execution Time"+
                    new Date()+"----->"+j);
        }
    }
}

public class JavaDemo03 {
    public static void main(String[] a) {
        myThread mt1 = new myThread();
        mt1.setName("子线程1");
        mt1.start();
        mt1.isAlive();
        Thread.currentThread().setName("主线程");
    }
}
