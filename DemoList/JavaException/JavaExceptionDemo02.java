
package JavaException;


/**
 * The type Java exception demo 02.
 * <p>
 * ��������£������Զ����쳣��Ҫ�̳�Exception��
 * �����̳�Exception������RuntimeException
 */
public class JavaExceptionDemo02 extends RuntimeException {
    /**�쳣��Ӧ�ķ�����*/
    private String retcd;
    /**�쳣��Ӧ��������Ϣ**/
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