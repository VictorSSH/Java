package JavaException;
/**
 * ��������: <br>
 * ��link����дӦ�ó���EcmDef.java�����������е�����������Ҫ�������븺�����������������
 * 	���������Ͳ�һ��(NumberFormatException)��ȱ�������в���(ArrayIndexOutOfBoundsException��
 *   	��0(ArithmeticException)�����븺��(EcDef �Զ�����쳣)�����쳣����
 * ��ʾ��
 * 	(1)������(EcmDef)�ж����쳣����(ecm)�������������ܡ�
 * 	(2)��main()������ʹ���쳣�����������쳣����
 * 	(3)�ڳ����У��Զ����Ӧ���븺�����쳣��(EcDef)��
 * 	(4)����ʱ���ܲ��� java EcmDef 20 10
 * 		//args[0]=��20�� args[1]=��10��
 * 	(5)Interger���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ����int a=Interger.parseInt(��314��);	//a=314;
 *
 * @param
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2018/4/11 5:06
 */

public class JavaExceptionDemo01 {
    public static void main(String[] a){
        try {
            /**������**/
            int i = Integer.parseInt(a[0]);
            /**����**/
            int j  = Integer.parseInt(a[1]);
            ecm(i,j);
        }catch (NumberFormatException e){
            System.out.println("������������Ͳ�һ�£�");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ȱ�������в�����");
        }catch (ArithmeticException e){
            System.out.println("��ĸΪ�㣡");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }

    }
    public static  void ecm (int i ,int j )throws EcDef{
         if (i<0 || j<0){
             throw  new EcDef("���������ֵ���ڸ�����");
         }
         System.out.println(i/j);
    }
}
/**�Զ����쳣��**/
class EcDef extends  Exception{
    static final long serialVersionUID = -33335345;
    public  EcDef (){}
    public  EcDef(String masg){
        super(masg);
    }
}