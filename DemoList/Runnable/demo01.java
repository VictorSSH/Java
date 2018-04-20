package Runnable;

import java.util.Date;

class Mydemo01 implements Runnable {
//    private static String name;
//    public Mydemo01(String n){
//        name=n;
//    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
//                System.out.println(name + ";" + Thread.currentThread().getName() +"值："+i+"\n"+ new Date(System.currentTimeMillis()));
                System.out.println( Thread.currentThread().getName() +"值："+i+"\n"+ new Date(System.currentTimeMillis()));
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
public class demo01 {
    public static void main(String[] a){
       Mydemo01 my = new Mydemo01();
        new Thread(my,"线程A").start();
        new Thread(my,"线程B").start();

    }
}
