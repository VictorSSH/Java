package con_myproject_ClassAndObject;

class MyThreadDemo02 extends  Thread{
    /**һ������Ʊ**/
    private  int ticket=5;
    /**��дrun()����**/
    @Override
    public void run() {
        /**����Ʊ����ѭ��**/
        for(int i=0;i<100;i++){
            /**�ж��Ƿ���ʣ��Ʊ��**/
            if(ticket>0){
                System.out.println("��Ʊ: ticket="+ticket--);
            }
        }
    }
}
public class JavaThreadDemo02 {
    public static void main(String[] a){
        /**�����̶߳���**/
        MyThreadDemo02 mtd1 = new MyThreadDemo02();
        MyThreadDemo02 mtd2 = new MyThreadDemo02();
        MyThreadDemo02 mtd3 = new MyThreadDemo02();
        /**������һ���߳�**/
        mtd1.start();
        /**�����ڶ����߳�**/
        mtd2.start();
        /**�����������߳�**/
        mtd3.start();
    }
}
