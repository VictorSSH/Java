package com.journaldev.exceptions;

/**
 * �Զ����쳣��
 **/
class MyException extends Exception {

    static final long seriaLVersionUID = 451313;

    public MyException(String s) {
        super(s);
    }
}

class TestCustomException1 {
    public int age;

    public void validate(int age) throws MyException {
        if (age < 18 || age > 20) {
            throw new MyException("����̫С��...");
        } else {
            System.out.println("welcome to world!");
        }
    }
}

public class JavaDemo05 {
    public static void main(String[] age) {
        TestCustomException1 tce = new TestCustomException1();
        try {
            tce.validate(50);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

}
