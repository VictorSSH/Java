package con_myproject_ClassAndObject;

public class JavaExceptionDemo01 {
    public static void main(String[] a){
        System.out.println("--------���㿪ʼ---------");
        int j =0;
        int x = 0;
        try{
            /**���յ�һ������**/
            String star1 = a[0];
            /**���յڶ�������**/
            String star2 = a[1];
            /**����һ���ַ���ת��Ϊ����**/
            j = Integer.parseInt(star1);
            /**���ڶ����ַ���ת��Ϊ����**/
            x = Integer.parseInt(star2);
            /**�˴�������쳣**/
            int temp = j/x;
            /**�˴����벻��ִ��**/
            System.out.println("������������:"+temp);
            System.out.println("===============");
        }catch (Exception e){
            System.out.println("�����쳣��"+e);
        }finally {
            System.out.println("����finally����");
        }
        System.out.println("-----�������---------");
    }
}
