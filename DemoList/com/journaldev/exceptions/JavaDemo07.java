package com.journaldev.exceptions;

/**
 * 多线程实现售票
 */
class SellTicketDemo03 implements Runnable {
    private int ticket = 30;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "票数为:" + ticket--);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static class JavaDemo07 {
        public static void main(String[] a) {
            SellTicketDemo03 sb = new SellTicketDemo03();
            Thread td1 = new Thread(sb);
            td1.start();
            td1.setName("子线程A");
            Thread td2 = new Thread(new SellTicketDemo03());
            td2.setName("子线程B");
            td2.start();
//            Thread td3 = new Thread(new SellTicketDemo03());
//            td3.setName("子线程C");
//            td3.start();
        }
    }
}
