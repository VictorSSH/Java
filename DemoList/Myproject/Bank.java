package Myproject;

public class Bank {
    Person[] ps = new Person[15];
    /**
     * ��֤���û�
     */
    public Person vaildatePerson(String name){

        for(int i = 0; i < ps.length; i++){
            if(ps[i] != null && name.equals(ps[i].getName())){
                return ps[i];
            }
        }
        return null;
    }

    /*
     * �������û�
     */
    public boolean savePerson(Person per) {
        // TODO ���¿������û����б���
        for(int i = 0; i < ps.length; i++){
            if(ps[i] == null){
                ps[i] = per;
                return true;
            }
        }
        return false;
    }

    /*
     * ��֤�û���¼
     */
    public Person vaildatePerson(String name, String pwd) {
        // TODO ��֤�û���¼
        for(int i = 0; i < ps.length; i++){
            if(ps[i] != null && name.equals(ps[i].getName()) && pwd.equals(ps[i].getPwd())){
                return ps[i];
            }
        }
        return null;
    }

    /**
     * ��ȡ�����û�
     * @return �����û�
     */
    public Person[] getAllUsers() {
        // TODO ���������û�
        return ps;
    }


}
