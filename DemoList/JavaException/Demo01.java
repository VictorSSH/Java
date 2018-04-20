package JavaException;
class Point<T>{
    /**次变量类型有外部决定**/
    private T var;

    public Point(T var){
        this.var= var;
    }
    /**返回值类型由外部指定**/
    public T getVar(){
        return var;
    }
    /**设置的类型由外部指定**/
    public void setVar(T var) {
        this.var = var;
    }
}
public class Demo01 {
    public static void main(String[] a){
        /**定义泛型类对象**/
        Point<String> p = new Point<>("叔本华");
        System.out.println("name："+p.getVar());
    }
}
