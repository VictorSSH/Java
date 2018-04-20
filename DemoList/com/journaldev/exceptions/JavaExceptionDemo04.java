package com.journaldev.exceptions;
/**自定义异常类继承Exception类**/
class MyExceptionMassage extends Exception{
    public MyExceptionMassage(String mas){
        super(mas);
    }
}
class student{
    int id;
    public void  student(int age)throws MyExceptionMassage {
        if (age < 10) {
            throw new MyExceptionMassage("这是年龄太小啦");
        }else{
            System.out.println("这是自定异常....");
        }
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                '}';
    }
}
public class JavaExceptionDemo04 {
    public static void main(String[] age) {
        student st = new student();
        try {
            st.student(45);
        }catch (MyExceptionMassage e){
         System.out.println( e.getMessage()+e.toString());
        }
    }
}
