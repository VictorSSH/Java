package com.journaldev.exceptions;

import java.util.Date;

import static java.lang.Thread.sleep;

/**
 * ͨ��ʹ��Runnable�ӿ�ʵ�ֶ��߳�
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
     * ��дrun()������run()�����̵߳�ִ����
     */
    @Override
    public void run() {
        for (int y = 0; y < 10; y++)
            try {
                System.out.println("��ǰ�߳�����ִ�е��̶߳������ã�" +
                        /**
                         * ���ضԵ�ǰ����ִ�е��̶߳��������
                         */
                        Thread.currentThread().getPriority() + "�߳�ִ������" +
                        name + "\tSystem Time:" +
                        /**
                         * ����ϵͳʱ��
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
