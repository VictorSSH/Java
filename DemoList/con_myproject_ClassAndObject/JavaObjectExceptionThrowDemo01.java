package con_myproject_ClassAndObject;

public class JavaObjectExceptionThrowDemo01 {
    public static void main(String[] a){
        try{
            /**�׳��쳣��ʵ��������**/
            throw new Exception("�Լ��׳��쳣..");
            /**�����쳣**/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
