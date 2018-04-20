package con_myproject_ClassAndObject;
/**自定义异常类继承Exception类**/
class MyException extends Exception{
    /**构造方法接收异常信息**/
    public MyException(String msg){
        /**调用父类中的构造方法**/
        super(msg);
    }
}
public class JavaCustomException {
    public static void main(String[] a){
        try{
            /**抛出异常**/
            throw  new MyException("自定义异常");
            /**异常处理**/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
