package con_myproject_ClassAndObject;
class Machg{
    /**�������Բ������쳣**/
    public int diva(int g,int h)throws Exception{
        int tem = g/h;
        return tem;
    }
}
public class JavaObjectExceptionThrowsDemo02 {
    public static void main(String[] a) throws Exception{
        Math math = new Math();
        math.div(10,0);
    }
}
