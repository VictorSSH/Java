package con_myproject_ClassAndObject;

class Math{
    /**�������Բ������쳣**/
    public int div(int i,int j)throws Exception{
        int temp = i/j;
        return temp;
    }
}
public class JavaObjectExceptionThrowsDemo01 {
    public static void main(String[] a){
        Math m = new Math();
        /**��Ϊ��throws�������Ƿ����쳣���֣������봦��**/
        try{
            System.out.println("����������"+m.div(10,0));
        }catch (Exception e){
            /**��ӡ�쳣��Ϣ**/
            e.printStackTrace();
            System.out.println("�����쳣...");
        }
    }
}
