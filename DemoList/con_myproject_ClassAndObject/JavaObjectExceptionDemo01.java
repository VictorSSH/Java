package con_myproject_ClassAndObject;

public class JavaObjectExceptionDemo01 {
    public static void main(String[] a){
        System.out.println("-----���㿪ʼ----------");
        int i = 0;
        int j = 0;
        try{
            /**���յ�һ������**/
            String star1=a[0];
            /**���յڶ�������**/
            String star2=a[1];
            /**����һ���������ַ���ת��Ϊ����**/
            i=Integer.parseInt(star1);
            /**���ڶ����������ַ���ת��Ϊ����**/
            j=Integer.parseInt(star2);
            /**�˴������쳣**/
            int tmp = i/j;
            /**�˴����벻ִ��**/
            System.out.println("��������Ľ���ǣ�"+tmp);
            System.out.println("------------");
            /**��׽�����쳣**/
        }catch(ArithmeticException e){
            System.out.println("�����쳣��"+e);
            /**��׽�ַ�ת���쳣**/
        }catch (NumberFormatException e){
            System.out.println("�ַ�ת���쳣��"+ e);
            /**����Խ���쳣**/
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("����Խ���쳣��"+e);
            /**���������쳣**/
        }catch (Exception e){
            System.out.println("�����쳣"+e);
        }

        System.out.println("---�������------");
    }
}
