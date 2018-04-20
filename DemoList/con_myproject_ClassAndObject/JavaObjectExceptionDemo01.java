package con_myproject_ClassAndObject;

public class JavaObjectExceptionDemo01 {
    public static void main(String[] a){
        System.out.println("-----计算开始----------");
        int i = 0;
        int j = 0;
        try{
            /**接收第一个参数**/
            String star1=a[0];
            /**接收第二个参数**/
            String star2=a[1];
            /**将第一个参数由字符串转换为整型**/
            i=Integer.parseInt(star1);
            /**将第二个参数由字符串转换为整型**/
            j=Integer.parseInt(star2);
            /**此处产生异常**/
            int tmp = i/j;
            /**此处代码不执行**/
            System.out.println("两数相除的结果是："+tmp);
            System.out.println("------------");
            /**捕捉算术异常**/
        }catch(ArithmeticException e){
            System.out.println("算术异常："+e);
            /**捕捉字符转换异常**/
        }catch (NumberFormatException e){
            System.out.println("字符转换异常："+ e);
            /**数组越界异常**/
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常："+e);
            /**处理其它异常**/
        }catch (Exception e){
            System.out.println("其他异常"+e);
        }

        System.out.println("---计算结束------");
    }
}
