package Runnable;

import JavaException.Demo02;

class DemoClass implements Runnable{
    @Override
    public void run() {
        showMasg();
    }

    public void showMasg(){
     for(int i = 0;i<10;i++){
         System.out.println(Thread.currentThread().getName()+i);
     }
 }
}
public class demo02 {
    public static void main(String[] a) {
//        Thread ty = new Thread(new DemoClass());
//        ty.setName("线程A");
//        ty.start();
//
//        Thread ty1 = new Thread(new DemoClass());
//        ty1.setName("线程B");
//        ty1.start();
        DemoClass dc = new DemoClass();
        Thread tr = new Thread(dc);
        tr.setName("线程A");
        tr.start();
       Thread tr1 =  new Thread(dc);
       tr1.setName("线程B");
       tr1.start();

    }
}
