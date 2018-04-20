package con_myproject_ClassAndObject;
class DemoPorint<T>{
    private  T varka;
    private  T varVl;

    public T getVarka() {
        return varka;
    }

    public void setVarka(T varka) {
        this.varka = varka;
    }

    public T getVarVl() {
        return varVl;
    }

    public void setVarVl(T varVl) {
        this.varVl = varVl;
    }
}
public class JavaDemo03 {
    public static void main(String[] a){
        /**定义DemoProint对象指定Inteer为泛型类型**/
        DemoPorint<Integer> p = new DemoPorint<>();
        /**设置整数自动装箱**/
        p.setVarka(23);
        p.setVarVl(2);
        /**自动拆箱**/
        int t = p.getVarka();
        int g = p.getVarVl();
        System.out.println("整数表示："+t);
        System.out.println("整数表示:"+g);

    }
}
