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
        /**定义泛型对象**/
        JavaDemoPorint<String> p = new JavaDemoPorint<>("哈哈哈");
        /**里面的类型为String类型**/
        p = new JavaDemoPorint<>("JAVA开发");
        /**取得字符串**/
        System.out.println("name："+p.getValr());
    }
}
