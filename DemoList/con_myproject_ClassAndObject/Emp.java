package con_myproject_ClassAndObject;
/**
 * ��������: <br>
 * ������emp�����ࡵ
 *
 * @param
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2018/4/4 16:08
 */
/**
 * �����Ա��
 */
public class Emp {
    /**  ��Ա���    */
    private int empno;
    /** ��Ա����*/
    private String ename;
    /**��Աְλ*/
    private String job;
    /** ��Ա��λ*/
    private double sal;
    /**��������*/
    private double comm;
    /**Ӷ��*/
    /**��ȷ�����޲ι��췽��*/
    public Emp(){}
    /**����һ���в����Ĺ��췽����*/
    public Emp(int eno,String name,String job,double sql,double com){
        /**Ϊ���Ը���ʼֵ*/
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
     * ȡ�ü�Java��Ļ�����Ϣ����Ϣ�ڱ����ô����
     * @return ��������������Ϣ���ַ�������
     */
public String getInfo(){
    return  "��ţ�"+empno+"\n"+
            "������"+ename+"\n"+
            "ְλ��"+job+"\n"+
            "���ʣ�"+sal+"\n"+
            "Ӷ��"+comm+"\n";
}

public static void main(String[] age){
    Emp e = new Emp(564,"Smit","it",4888.0,
            4.0);
    System.out.println(e.getInfo());
}



}
