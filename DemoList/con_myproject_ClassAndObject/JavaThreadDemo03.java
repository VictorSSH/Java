package con_myproject_ClassAndObject;
/**ʵ��Runnable�ӿ�**/
class MyThreadDemo01 implements Runnable{
        /**��д�ӿ��е�run()����**/
    @Override
    public void run() {
        this.sled();
    }
    public synchronized void sled()

    {
        /**ѭ���������**/
        for (int i = 0; i < 3; i++) {

            /**ȡ�õ�ǰ�̵߳�����**/
            System.out.println(Thread.currentThread().getName() + "this run i=:" + i);
        }
    }

    }


public class JavaThreadDemo03 {
    public static void main(String[] a){
        /**����Runnable���� ����**/
        MyThreadDemo01   my = new MyThreadDemo01();
        Thread t = new Thread();
        System.out.println("����ִ��֮ǰ---"+t.isAlive());
        /**ϵͳ�Զ������߳�����**/
        new Thread(my).start();
        /**�ֹ������߳�����**/
        new Thread(my,"�߳�-A").start();
        new Thread(my,"�߳�-B").start();
        /**ϵͳ�Զ������߳�����**/
        new Thread(my).start();
//        Thread t = new Thread();
         t.start();
         System.out.println("����ִ��֮��"+t.isAlive());

    }
}
