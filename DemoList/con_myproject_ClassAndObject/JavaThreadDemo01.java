package con_myproject_ClassAndObject;

class MyThread extends Thread{
    /**����**/
    private String name;
    /**ͨ�����췽��������������**/
    public MyThread(String name){
        /**Ϊname���Ը�ֵ**/
        this.name= name;
    }
    /**��дThread���е�run()�������˷������̵߳�����**/
    @Override
    public void run() {
        /**�߳���,ѭ�����10��**/
        for(int i=0;i<10;i++){
            System.out.println(name+"���У�i=  "+i);
        }
    }
}
public class JavaThreadDemo01 {
    public static void main(String[] a){
        /**ʵ��������**/
        MyThread mt = new MyThread("�߳�A");
        MyThread mt2 = new MyThread("�߳�B");
        /**�����߳�����**/
//        mt.run();
//        mt2.run();
        /**ʹ�ô�Thread��̳ж�����start()���������߳�**/
        mt.start();
        mt2.start();
//       startSyste mt2.getName();
    }
}
