package con_myproject_ClassAndObject;
/**
 * 功能描述: <br>
 * 〈开发emp程序类〉
 *
 * @param
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2018/4/4 16:08
 */
/**
 * 定义雇员类
 */
public class Emp {
    /**  雇员编号    */
    private int empno;
    /** 雇员姓名*/
    private String ename;
    /**雇员职位*/
    private String job;
    /** 雇员岗位*/
    private double sal;
    /**基本工资*/
    private double comm;
    /**佣金*/
    /**明确定义无参构造方法*/
    public Emp(){}
    /**定义一个有参数的构造方法，*/
    public Emp(int eno,String name,String job,double sql,double com){
        /**为属性赋初始值*/
        this.empno = eno;
        this.ename = name;
        this.job = job;
        this.sal = sql;
        this.comm = com;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }
    /**
     * 取得简单Java类的基本信息，信息在被调用处输出
     * @return 包含对象完整信息的字符串数据
     */
public String getInfo(){
    return  "编号："+empno+"\n"+
            "姓名："+ename+"\n"+
            "职位："+job+"\n"+
            "工资："+sal+"\n"+
            "佣金："+comm+"\n";
}

public static void main(String[] age){
    Emp e = new Emp(564,"Smit","it",4888.0,
            4.0);
    System.out.println(e.getInfo());
}



}
