package con_myproject_ClassAndObject;

public class JavaObjectExceptionThrowDemo01 {
    public static void main(String[] a){
        try{
            /**抛出异常的实例化对象**/
            throw new Exception("自己抛出异常..");
            /**捕获异常**/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
