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
        /**����DemoProint����ָ��InteerΪ��������**/
        DemoPorint<Integer> p = new DemoPorint<>();
        /**���������Զ�װ��**/
        p.setVarka(23);
        p.setVarVl(2);
        /**�Զ�����**/
        int t = p.getVarka();
        int g = p.getVarVl();
        System.out.println("������ʾ��"+t);
        System.out.println("������ʾ:"+g);

    }
}
