package Runnable;

public class ThreadRunnableDemo01 implements Runnable {
    private int i;
Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
        }
    }
    public static void main(String[] a){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
        if(i ==10){
            ThreadRunnableDemo01 trd = new ThreadRunnableDemo01();
            new Thread(trd,"线程A").start();
            new Thread(trd,"线程B").start();
        }
        }
    }
}
