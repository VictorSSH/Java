package con_myproject_ClassAndObject;

abstract  class  javaObjectPolymorphicDemo1{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void javaObjectPolymorphicDemo1(){}
    public String drink(){
        return "�����ǣ�"+name+"\n���䣺"+age;
    }

    @Override
    public String toString() {
        return null;
    }
}
class ComputerDepartment extends javaObjectPolymorphicDemo1{
    private String ClassName;

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String drink() {
        return super.drink()+"�༶���ƣ�"+ClassName;
    }

    @Override
    public String toString() {
        return super.toString()+"�༶����"+ClassName;
    }
}
public class JavaObjePolymorphic {
    public static void main(String[] a){
        /**����һ����������**/
        javaObjectPolymorphicDemo1[] jpd = new javaObjectPolymorphicDemo1[2];
        /**����һ������*/
        ComputerDepartment cd = new ComputerDepartment();
        /**���������������*/
        jpd[0] = cd;
        for(int i =0;i<2;i++){
            System.out.println(jpd[i].toString()+"------"+jpd[i].drink());
        }
    }
}
