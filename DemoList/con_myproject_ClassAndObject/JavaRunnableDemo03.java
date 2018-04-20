package con_myproject_ClassAndObject;
class MyRunnableDemo03 implements Runnable{
    /**总共五张票**/
    private  int ticket=5;
/**覆写run()方法**/
    @Override
    public void run() {
        /**超出票数的循环**/
        for(int i=0;i<100;i++){
            /**判断是否有剩余票数**/
            if(ticket>0){
                System.out.println("卖票 ticket = "+ticket--);
            }
        }
    }
}
public class JavaRunnableDemo03 {
    public static void main(String[] a){
        MyRunnableDemo03 mrd1 = new MyRunnableDemo03();
        /**启动三个线程**/
        new Thread(mrd1).start();
        new Thread(mrd1).start();
        new Thread(mrd1).start();

    }
}
