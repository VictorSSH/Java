package Blank;

public class Account {
    /**
     * 封装账户编号，账户余额的两个成员变量
     */
    private String accountNo;
    private double balance;
    /**
     * 构造方法
     */
    public  Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance=balance;
    }

//    public String getAccountNo() {
//        return accountNo;
//    }
//
//    public void setAccountNo(String accountNo) {
//        this.accountNo = accountNo;
//    }
    /**
     * 因为账户余额不足不允许随便修改，所以只为balance提供getter方法
     */
    public double getBalance() {
        return this.balance;
    }
    /**
     * 提供一个线程安全的draw()方法，来完成取钱操作
     */
    public synchronized void draw(double drawAmount) {
        /**
         * 账户余额大于取钱
         */
        if (balance >= drawAmount) {
            /**
             * 取钱成功
             */
            System.out.println(Thread.currentThread().getName() + "取钱成功！ 正在出钞，请勿走开!" + drawAmount);

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            /**
             * 修改余额
             */
            balance -= drawAmount;
            System.out.println("\t您的余额为:" + balance);
        } else {
            System.out.println(Thread.currentThread().getName()+"取钱失败！ 余额不足");
        }
    }
}
