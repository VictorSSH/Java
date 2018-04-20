package con_myproject_ClassAndObject;

class MyThread extends Thread{
    /**属性**/
    private String name;
    /**通过构造方法设置属性内容**/
    public MyThread(String name){
        /**为name属性赋值**/
        this.name= name;
    }
    /**覆写Thread类中的run()方法，此方法是线程的主体**/
    @Override
    public void run() {
        /**线程体,循环输出10次**/
        for(int i=0;i<10;i++){
            System.out.println(name+"运行，i=  "+i);
        }
    }
}
public class JavaThreadDemo01 {
    public static void main(String[] a){
        /**实例化对象**/
        MyThread mt = new MyThread("线程A");
        MyThread mt2 = new MyThread("线程B");
        /**调用线程主体**/
//        mt.run();
//        mt2.run();
        /**使用从Thread类继承而来的start()方法启动线程**/
        mt.start();
        mt2.start();
//       startSyste mt2.getName();
    }
}
