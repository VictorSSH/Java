package JavaException;
class Point<T>{
    /**�α����������ⲿ����**/
    private T var;

    public Point(T var){
        this.var= var;
    }
    /**����ֵ�������ⲿָ��**/
    public T getVar(){
        return var;
    }
    /**���õ��������ⲿָ��**/
    public void setVar(T var) {
        this.var = var;
    }
}
public class Demo01 {
    public static void main(String[] a){
        /**���巺�������**/
        Point<String> p = new Point<>("�屾��");
        System.out.println("name��"+p.getVar());
    }
}
