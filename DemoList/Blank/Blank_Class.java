package Blank;

public class Blank_Class {
    /**
     * ���
     */
    public int balance = 500;
    /**
     * ��ѯ
     */
    public int getBalance(){
        return  balance;
    }
    /**
     * ȡ��
     */
    public void withdraw(int amount){
        balance = balance -amount;
    }
    /**
     * ��Ǯ
     */
    public void deposit(int amount){
        balance = balance +amount;
    }
}
