package com.journaldev.exceptions;

/**
 * ����һ�����ڵ�ö����
 **/
enum WeeKenum {
    /**
     * �ڵ�һ����ʾ���г�7��ö��ʵ����ϵͳ���Զ����public static final����
     **/
    SUNDAY("������"), MONDAY("����һ"), TUESDAY("���ڶ�"), WEDNESDAY("������"), THURSDAY("������"), FRIDAY("������"), SATURDAY("������");
    /**
     * ����һ��private���ε�ʵ������
     **/
    private String date;

    /**
     * ����һ���������Ĺ��췽����ö����Ĺ��췽��ֻ��ʹ��private����
     **/
    private WeeKenum(String date) {
        this.date = date;
    }

    /**
     * ����get,set����
     **/
    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WeeKenum{" +
                "date='" + date + '\'' +
                '}';
    }

    public static  class JavaDemo01 {
        public static  void main(String[] a) {
            for (WeeKenum w : WeeKenum.values()) {
                System.out.println(w);
            }
        }
    }
}
