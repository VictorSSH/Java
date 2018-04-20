package con_myproject_ClassAndObject;

class MyRunnable implements Runnable{
    /**属性**/
    private String name;
    /**通过构造方法设置属性内容**/
    public MyRunnable(String name){
        this.name= name;
    }

    /**覆写Runnable接口中的run()方法**/
    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println(name+"运行，i "+i);
       }
    }
}
public class JavaRunnableDemo01 {
    public static void main(String[] a){
        /**实例化Runnable对象**/
        MyRunnable mr1 = new MyRunnable("线程A");
        MyRunnable mr2 = new MyRunnable("线程B");
        /**实例化Thread对象**/
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        /**调用Thread类的start()方法**/
        t1.start();
        t2.start();
    }
}
