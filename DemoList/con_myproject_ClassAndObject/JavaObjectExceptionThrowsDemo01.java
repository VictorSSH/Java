package con_myproject_ClassAndObject;

class Math{
    /**方法可以不处理异常**/
    public int div(int i,int j)throws Exception{
        int temp = i/j;
        return temp;
    }
}
public class JavaObjectExceptionThrowsDemo01 {
    public static void main(String[] a){
        Math m = new Math();
        /**因为有throws，不管是否有异常出现，都必须处理**/
        try{
            System.out.println("除法操作："+m.div(10,0));
        }catch (Exception e){
            /**打印异常信息**/
            e.printStackTrace();
            System.out.println("除法异常...");
        }
    }
}
