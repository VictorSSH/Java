package con_myproject_ClassAndObject;
/**�Զ����쳣��̳�Exception��**/
class MyException extends Exception{
    /**���췽�������쳣��Ϣ**/
    public MyException(String msg){
        /**���ø����еĹ��췽��**/
        super(msg);
    }
}
public class JavaCustomException {
    public static void main(String[] a){
        try{
            /**�׳��쳣**/
            throw  new MyException("�Զ����쳣");
            /**�쳣����**/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
