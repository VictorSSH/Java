package con_myproject_ClassAndObject;

public class ExceptionDemo01 {
    public static void main(String[] age){
        System.out.println("���㿪ʼ����");
        int a=10;
        int b =0;
        try{
            /**�˴�������쳣���˴��벻��ִ��*/
            int tmp = a/b;
            System.out.println("���������������ڣ�"+tmp);
            System.out.println("--------------");
            /**���������쳣**/
        }catch(ArithmeticException e){
            /**�����쳣ִ���쳣�������**/
            System.out.println("�����쳣"+e);
        }finally {
            System.out.println("�����Ƿ�����쳣ִ�д˴������");
        }
        System.out.println("�������");
    }
}
