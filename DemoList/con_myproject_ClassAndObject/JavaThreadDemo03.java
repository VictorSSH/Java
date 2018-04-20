package con_myproject_ClassAndObject;
/**实现Runnable接口**/
class MyThreadDemo01 implements Runnable{
        /**覆写接口中的run()方法**/
    @Override
    public void run() {
        this.sled();
    }
    public synchronized void sled()

    {
        /**循环输出三次**/
        for (int i = 0; i < 3; i++) {

            /**取得当前线程的名称**/
            System.out.println(Thread.currentThread().getName() + "this run i=:" + i);
        }
    }

    }


public class JavaThreadDemo03 {
    public static void main(String[] a){
        /**定义Runnable子类 对象**/
        MyThreadDemo01   my = new MyThreadDemo01();
        Thread t = new Thread();
        System.out.println("代码执行之前---"+t.isAlive());
        /**系统自动设置线程名称**/
        new Thread(my).start();
        /**手工设置线程名称**/
        new Thread(my,"线程-A").start();
        new Thread(my,"线程-B").start();
        /**系统自动设置线程名称**/
        new Thread(my).start();
//        Thread t = new Thread();
         t.start();
         System.out.println("代码执行之后："+t.isAlive());

    }
}
