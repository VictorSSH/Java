package con_myproject_ClassAndObject;

/**
 * ��������: <br>
 * ����
 *
 * @param
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2018/4/8 15:12
 */
abstract class  demo1{

    public void fun1(){
        System.out.println("���Ǹ���fun1����");
    }
}
class demo2 extends demo1{
    public void fun1(){
        System.out.println("������д����fun1����");
    }
    public void fun2(){
        System.out.println("�����Լ�fun2����");
    }

}
class demo3 extends demo2{
    @Override
    public void fun1() {
        super.fun1();
        System.out.println("��д����demo2��fun1����");
    }

    @Override
    public void fun2() {
        super.fun2();
        System.out.println("��д����demo2��fun2����");
    }
    public void  fun3(){
        System.out.println("demo3 ���Լ����еķ���");
    }
}
public class java_Object_Polymorphic {
    public static void main(String[] a){
        demo1[] a1 = new demo1[2];
//        ((demo2) d).fun2();
        /**���������������*/
        demo2 d2 = new demo2();
        demo3 d3 = new demo3();
        /**���������������*/
        a1[0] = d2;
        a1[1] = d3;
        for (int i =0;i<3;i++){
            System.out.println(a1[i]);
        }
//        demo3 b1 = (demo3)a1;
//        b1.fun2();
//        b1.fun2();
//        b1.fun3();


    }
}
