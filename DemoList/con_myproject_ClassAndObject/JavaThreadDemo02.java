package con_myproject_ClassAndObject;

class MyThreadDemo02 extends  Thread{
    /**一共五张票**/
    private  int ticket=5;
    /**覆写run()方法**/
    @Override
    public void run() {
        /**超出票数的循环**/
        for(int i=0;i<100;i++){
            /**判断是否有剩余票数**/
            if(ticket>0){
                System.out.println("买票: ticket="+ticket--);
            }
        }
    }
}
public class JavaThreadDemo02 {
    public static void main(String[] a){
        /**定义线程对象**/
        MyThreadDemo02 mtd1 = new MyThreadDemo02();
        MyThreadDemo02 mtd2 = new MyThreadDemo02();
        MyThreadDemo02 mtd3 = new MyThreadDemo02();
        /**启动第一个线程**/
        mtd1.start();
        /**启动第二个线程**/
        mtd2.start();
        /**启动第三个线程**/
        mtd3.start();
    }
}
