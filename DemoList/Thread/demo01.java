package Thread;

import java.util.Date;

class mydemo01 extends Thread {
    private String name;
    private int index;
    private static int inde = 30;
  Object obj = new Object();
    public mydemo01(String n, int x) {
        name = n;
        index = x;
    }



    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (inde > 0) {
                    System.out.println(Thread.currentThread().getName() + "\tname:" + name + "\tindex:" + index + "；" + "\t" + inde--+"\t"+
                            new Date(System.currentTimeMillis()));
                    try {
                        Thread.sleep(index);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}

public class demo01 {
    public static void main(String[] a) {
        mydemo01 md = new mydemo01("线程A", 100);

        md.start();
        mydemo01 md1 = new mydemo01("线程B",100);
        md1.start();
        mydemo01 md2 = new mydemo01("线程C",100);
        md2.start();
    }
}
