package Blank;
import  Blank.Blank_Class;
/**
 * 此线程类实现Runnable接口<br />
 * 线程同步 ：使用同步块，实现线程同步<br />
 * 同步synchronized块的对象监视锁可为为: 任意的对象(此处为'account'对象)。<br />
 * (Runnable适用于共享同一对象(如:this)，如果Thread继承就会有问题[保证Thread继承下安全：1.锁使用涉及当前对象外的对象(例如：SyncBlock、BankAccount对象外的其他类对象；2.锁使用静态当前类对象)])<br />
 * 多个线程使用同一把锁，如果线程安全必需确保:多个线程使用的是同一个对象监视锁对象<br />
 * 所有访问此同步代码块的线程都在同步块外等待,都会判断同步锁,降低效率,但确保线程安全问题,外,同步代码块外代码正常执行<br />
 * 同步方法优于同步代码块：性能和memory空间上。
 * */
public class SyncBlock implements Runnable {
    /**
     * 所有Thread多线程都共享Runnable(接口对象)和account对象
     */
    private  Blank_Class aClass = new Blank_Class();
    /**
     *
     */
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            makeWithdraw(100);
            //总共取款5次
            //每次取款100
            if (account.getBalance() < 0) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
