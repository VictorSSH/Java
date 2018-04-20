package con_myproject_ClassAndObject;

public class JavaExceptionDemo01 {
    public static void main(String[] a){
        System.out.println("--------计算开始---------");
        int j =0;
        int x = 0;
        try{
            /**接收第一个参数**/
            String star1 = a[0];
            /**接收第二个参数**/
            String star2 = a[1];
            /**将第一个字符串转换为整型**/
            j = Integer.parseInt(star1);
            /**将第二个字符串转换为整型**/
            x = Integer.parseInt(star2);
            /**此处会产生异常**/
            int temp = j/x;
            /**此处代码不会执行**/
            System.out.println("两数相除结果是:"+temp);
            System.out.println("===============");
        }catch (Exception e){
            System.out.println("其他异常："+e);
        }finally {
            System.out.println("这是finally语句块");
        }
        System.out.println("-----计算结束---------");
    }
}
