package con_myproject_ClassAndObject;

/**ʹ�÷��ͷ�����ӡ��ͬ�ַ���Ԫ��**/
class Point<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
public class JavaDemo01 {
    public static void main(String[] a){
        Point<String> p = new Point<>();
        p.setVar("sdfasdf");

        System.out.println(p.getVar());
    }
}
