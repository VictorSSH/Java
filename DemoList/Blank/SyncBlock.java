package Blank;
import  Blank.Blank_Class;
/**
 * ���߳���ʵ��Runnable�ӿ�<br />
 * �߳�ͬ�� ��ʹ��ͬ���飬ʵ���߳�ͬ��<br />
 * ͬ��synchronized��Ķ����������ΪΪ: ����Ķ���(�˴�Ϊ'account'����)��<br />
 * (Runnable�����ڹ���ͬһ����(��:this)�����Thread�̳оͻ�������[��֤Thread�̳��°�ȫ��1.��ʹ���漰��ǰ������Ķ���(���磺SyncBlock��BankAccount����������������2.��ʹ�þ�̬��ǰ�����)])<br />
 * ����߳�ʹ��ͬһ����������̰߳�ȫ����ȷ��:����߳�ʹ�õ���ͬһ���������������<br />
 * ���з��ʴ�ͬ���������̶߳���ͬ������ȴ�,�����ж�ͬ����,����Ч��,��ȷ���̰߳�ȫ����,��,ͬ����������������ִ��<br />
 * ͬ����������ͬ������飺���ܺ�memory�ռ��ϡ�
 * */
public class SyncBlock implements Runnable {
    /**
     * ����Thread���̶߳�����Runnable(�ӿڶ���)��account����
     */
    private  Blank_Class aClass = new Blank_Class();
    /**
     *
     */
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            makeWithdraw(100);
            //�ܹ�ȡ��5��
            //ÿ��ȡ��100
            if (account.getBalance() < 0) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
