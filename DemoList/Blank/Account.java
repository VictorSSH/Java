package Blank;

public class Account {
    /**
     * ��װ�˻���ţ��˻�����������Ա����
     */
    private String accountNo;
    private double balance;
    /**
     * ���췽��
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
     * ��Ϊ�˻����㲻��������޸ģ�����ֻΪbalance�ṩgetter����
     */
    public double getBalance() {
        return this.balance;
    }
    /**
     * �ṩһ���̰߳�ȫ��draw()�����������ȡǮ����
     */
    public synchronized void draw(double drawAmount) {
        /**
         * �˻�������ȡǮ
         */
        if (balance >= drawAmount) {
            /**
             * ȡǮ�ɹ�
             */
            System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ��� ���ڳ����������߿�!" + drawAmount);

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            /**
             * �޸����
             */
            balance -= drawAmount;
            System.out.println("\t�������Ϊ:" + balance);
        } else {
            System.out.println(Thread.currentThread().getName()+"ȡǮʧ�ܣ� ����");
        }
    }
}
