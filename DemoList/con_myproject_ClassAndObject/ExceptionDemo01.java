package con_myproject_ClassAndObject;

public class ExceptionDemo01 {
    public static void main(String[] age){
        System.out.println("计算开始；；");
        int a=10;
        int b =0;
        try{
            /**此处会产生异常，此代码不在执行*/
            int tmp = a/b;
            System.out.println("两个数相除结果等于："+tmp);
            System.out.println("--------------");
            /**捕获算术异常**/
        }catch(ArithmeticException e){
            /**出现异常执行异常处理语句**/
            System.out.println("出现异常"+e);
        }finally {
            System.out.println("不管是否出现异常执行此代码语句");
        }
        System.out.println("计算结束");
    }
}
