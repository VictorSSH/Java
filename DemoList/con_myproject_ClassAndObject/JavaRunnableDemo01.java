package con_myproject_ClassAndObject;

class MyRunnable implements Runnable{
    /**����**/
    private String name;
    /**ͨ�����췽��������������**/
    public MyRunnable(String name){
        this.name= name;
    }

    /**��дRunnable�ӿ��е�run()����**/
    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println(name+"���У�i "+i);
       }
    }
}
public class JavaRunnableDemo01 {
    public static void main(String[] a){
        /**ʵ����Runnable����**/
        MyRunnable mr1 = new MyRunnable("�߳�A");
        MyRunnable mr2 = new MyRunnable("�߳�B");
        /**ʵ����Thread����**/
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        /**����Thread���start()����**/
        t1.start();
        t2.start();
    }
}
