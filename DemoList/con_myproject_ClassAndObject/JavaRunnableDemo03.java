package con_myproject_ClassAndObject;
class MyRunnableDemo03 implements Runnable{
    /**�ܹ�����Ʊ**/
    private  int ticket=5;
/**��дrun()����**/
    @Override
    public void run() {
        /**����Ʊ����ѭ��**/
        for(int i=0;i<100;i++){
            /**�ж��Ƿ���ʣ��Ʊ��**/
            if(ticket>0){
                System.out.println("��Ʊ ticket = "+ticket--);
            }
        }
    }
}
public class JavaRunnableDemo03 {
    public static void main(String[] a){
        MyRunnableDemo03 mrd1 = new MyRunnableDemo03();
        /**���������߳�**/
        new Thread(mrd1).start();
        new Thread(mrd1).start();
        new Thread(mrd1).start();

    }
}
