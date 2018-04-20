package com.journaldev.exceptions;

class Teacher {
    private Computer cmp;

    public void shangKe() throws NoPlanException {
        cmp = new Computer();
        try {
            cmp.run();
        } catch (LanPingException e)               /*���Բ������������쳣*/ {
            cmp.recst();
        } catch (MaoYanException e)                /*���Բ��������ð�̵��쳣*/ {
            throw new NoPlanException("�Ͽ��޷�����,��Ϊ" + e.getMessage());    /*�����޷���������쳣������������쳣�׸���ʦ������*/
        }

        System.out.println("��ʦ�Ͽ�");                /*û���쳣����ʦ�������Ͽ�*/
    }
}

class MaoYanException extends Exception             /*�Զ������ð���쳣*/ {
    MaoYanException(String m) {
        super(m);
    }
}

class NoPlanException extends Exception             /*�Զ�����ʦ�����쳣*/ {
    NoPlanException(String m) {
        super(m);
    }
}

class LanPingException extends Exception               /*�Զ��������쳣*/ {
    LanPingException(String m) {
        super(m);
    }
}

class Computer {
    private int state = 3;           /*��ͬ���쳣״̬ѡ��*/

    public void run() throws LanPingException, MaoYanException {
        if (state == 2) {
            throw new LanPingException("����������");        /*�����������׳��쳣����*/
        }
        if (state == 3) {
            throw new MaoYanException("����ð����");
        }
        System.out.println("��������");
    }


    public void recst() {
        System.out.println("��������");
    }
}

public class JavaExceptionDemo {
    public static void main(String[] a) {
        Teacher t = new Teacher();
        try {
            t.shangKe();
        } catch (NoPlanException e)               /*��ʦ���������ð���쳣*/ {
            System.out.println(e.toString());
        }
    }
}

