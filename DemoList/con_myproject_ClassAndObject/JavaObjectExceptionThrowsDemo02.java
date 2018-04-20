package con_myproject_ClassAndObject;
class Machg{
    /**方法可以不处理异常**/
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
