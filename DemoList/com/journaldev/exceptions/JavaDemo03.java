package com.journaldev.exceptions;

import java.util.Date;

/**
 * ͨ���̳�Thread�ഴ�����߳�
 */
class myThread extends Thread {
    private int x;

    /**
     * ��дrun()������run()�����ķ���������̵߳�ִ����
     */
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            /**
             * 1�����̼̳߳�Thread��ʱ,ֱ��ʹ��this���ɻ�ȡ��ǰ�߳�
             * 2,Thread�����getName()���ص�ǰ�̵߳����֣�
             * 3, ��˿���ֱ�ӵ���getName()�������ص�ǰ�̵߳�����
             */
            System.out.println("--->this is Thread ID: " +
                    /**
                     *�÷��������̵߳�ID��ʶ��
                     */
                    getId() + "--> Thread name:" +
                    /***
                     * �÷��������̵߳�����
                     */
                    getName() + "--->The array of stack trace elements of the stack dump "+
                    /***
                     *  ���ر�ʾ���̵߳Ķ�ջת���Ķ�ջ����Ԫ�ص�����
                     */
                    getStackTrace()+"execution Time"+
                    new Date()+"----->"+j);
        }
    }
}

public class JavaDemo03 {
    public static void main(String[] a) {
        myThread mt1 = new myThread();
        mt1.setName("���߳�1");
        mt1.start();
        mt1.isAlive();
        Thread.currentThread().setName("���߳�");
    }
}
