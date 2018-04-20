package JavaException;
/**
 * 功能描述: <br>
 * 〈link〉编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
 * 	对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
 *   	除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异常处理。
 * 提示：
 * 	(1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
 * 	(2)在main()方法中使用异常处理语句进行异常处理。
 * 	(3)在程序中，自定义对应输入负数的异常类(EcDef)。
 * 	(4)运行时接受参数 java EcmDef 20 10
 * 		//args[0]=“20” args[1]=“10”
 * 	(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。如int a=Interger.parseInt(“314”);	//a=314;
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
            /**被除数**/
            int i = Integer.parseInt(a[0]);
            /**除数**/
            int j  = Integer.parseInt(a[1]);
            ecm(i,j);
        }catch (NumberFormatException e){
            System.out.println("输入的数据类型不一致！");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数！");
        }catch (ArithmeticException e){
            System.out.println("分母为零！");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }

    }
    public static  void ecm (int i ,int j )throws EcDef{
         if (i<0 || j<0){
             throw  new EcDef("您输入的数值存在负数！");
         }
         System.out.println(i/j);
    }
}
/**自定义异常类**/
class EcDef extends  Exception{
    static final long serialVersionUID = -33335345;
    public  EcDef (){}
    public  EcDef(String masg){
        super(masg);
    }
}