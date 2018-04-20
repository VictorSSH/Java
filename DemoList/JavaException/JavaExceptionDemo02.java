
package JavaException;


/**
 * The type Java exception demo 02.
 * <p>
 * 多数情况下，创建自定义异常需要继承Exception，
 * 本例继承Exception的子类RuntimeException
 */
public class JavaExceptionDemo02 extends RuntimeException {
    /**异常对应的返回码*/
    private String retcd;
    /**异常对应的描述信息**/
    private String masgDes;
    public JavaExceptionDemo02(){
        super();
    }
    public JavaExceptionDemo02(String message){
        super(message);
        masgDes =message;
    }
    public JavaExceptionDemo02(String retcd,String masgDes){
        super();
        this.retcd = retcd;
        this.masgDes = masgDes;
    }
    public String getRetcd(){
        return retcd;
    }
    public String getMasgDes(){
        return masgDes;
    }
}
class TestClass{
    public void testException() throws JavaExceptionDemo02{
        try {

        }catch (Exception e){
            throw  new JavaExceptionDemo02("1212a2","String[]");
        }
    }
}