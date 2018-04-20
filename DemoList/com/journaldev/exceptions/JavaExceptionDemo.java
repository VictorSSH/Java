package com.journaldev.exceptions;

class Teacher {
    private Computer cmp;

    public void shangKe() throws NoPlanException {
        cmp = new Computer();
        try {
            cmp.run();
        } catch (LanPingException e)               /*电脑捕获处理蓝屏的异常*/ {
            cmp.recst();
        } catch (MaoYanException e)                /*电脑捕获处理电脑冒烟的异常*/ {
            throw new NoPlanException("上课无法继续,因为" + e.getMessage());    /*电脑无法处理这个异常，继续把这个异常抛给老师来处理*/
        }

        System.out.println("老师上课");                /*没有异常，老师就正常上课*/
    }
}

class MaoYanException extends Exception             /*自定义电脑冒烟异常*/ {
    MaoYanException(String m) {
        super(m);
    }
}

class NoPlanException extends Exception             /*自定义老师处理异常*/ {
    NoPlanException(String m) {
        super(m);
    }
}

class LanPingException extends Exception               /*自定义蓝屏异常*/ {
    LanPingException(String m) {
        super(m);
    }
}

class Computer {
    private int state = 3;           /*不同的异常状态选择*/

    public void run() throws LanPingException, MaoYanException {
        if (state == 2) {
            throw new LanPingException("电脑蓝屏了");        /*符合条件就抛出异常对象*/
        }
        if (state == 3) {
            throw new MaoYanException("电脑冒烟了");
        }
        System.out.println("电脑运行");
    }


    public void recst() {
        System.out.println("电脑重启");
    }
}

public class JavaExceptionDemo {
    public static void main(String[] a) {
        Teacher t = new Teacher();
        try {
            t.shangKe();
        } catch (NoPlanException e)               /*老师捕获处理电脑冒烟异常*/ {
            System.out.println(e.toString());
        }
    }
}

