package com.journaldev.exceptions;
/**�Զ����쳣��̳�Exception��**/
class MyExceptionMassage extends Exception{
    public MyExceptionMassage(String mas){
        super(mas);
    }
}
class student{
    int id;
    public void  student(int age)throws MyExceptionMassage {
        if (age < 10) {
            throw new MyExceptionMassage("��������̫С��");
        }else{
            System.out.println("�����Զ��쳣....");
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
