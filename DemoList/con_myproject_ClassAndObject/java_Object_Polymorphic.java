package con_myproject_ClassAndObject;

/**
 * 功能描述: <br>
 * 〈〉
 *
 * @param
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2018/4/8 15:12
 */
abstract class  demo1{

    public void fun1(){
        System.out.println("这是父类fun1方法");
    }
}
class demo2 extends demo1{
    public void fun1(){
        System.out.println("子类重写父类fun1方法");
    }
    public void fun2(){
        System.out.println("子类自己fun2方法");
    }

}
class demo3 extends demo2{
    @Override
    public void fun1() {
        super.fun1();
        System.out.println("重写父类demo2，fun1方法");
    }

    @Override
    public void fun2() {
        super.fun2();
        System.out.println("重写父类demo2，fun2方法");
    }
    public void  fun3(){
        System.out.println("demo3 类自己特有的方法");
    }
}
public class java_Object_Polymorphic {
    public static void main(String[] a){
        demo1[] a1 = new demo1[2];
//        ((demo2) d).fun2();
        /**定义两个子类对象*/
        demo2 d2 = new demo2();
        demo3 d3 = new demo3();
        /**父类引用子类对象*/
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
