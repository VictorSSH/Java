package con_myproject_ClassAndObject;
class JavaDemoPorint<T>{
    private  T valr;
    /****/
    public  JavaDemoPorint(T valr){
       this.valr = valr;
    }
    public T getValr() {
        return valr;
    }

    public void setValr(T valr) {
        this.valr = valr;
    }
}
public class JavaDemo04 {
    public static void main(String[] a){
        /**���巺�Ͷ���**/
        JavaDemoPorint<String> p = new JavaDemoPorint<>("������");
        /**���������ΪString����**/
        p = new JavaDemoPorint<>("JAVA����");
        /**ȡ���ַ���**/
        System.out.println("name��"+p.getValr());
    }
}
