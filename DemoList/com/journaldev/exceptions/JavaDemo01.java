package com.journaldev.exceptions;

/**
 * 定义一个星期的枚举类
 **/
enum WeeKenum {
    /**
     * 在第一行显示的列出7个枚举实例，系统会自动添加public static final修饰
     **/
    SUNDAY("星期日"), MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六");
    /**
     * 定义一个private修饰的实例变量
     **/
    private String date;

    /**
     * 定义一个带参数的构造方法，枚举类的构造方法只能使用private修饰
     **/
    private WeeKenum(String date) {
        this.date = date;
    }

    /**
     * 定义get,set方法
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
