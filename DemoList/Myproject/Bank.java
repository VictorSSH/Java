package Myproject;

public class Bank {
    Person[] ps = new Person[15];
    /**
     * 验证新用户
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
     * 保存新用户
     */
    public boolean savePerson(Person per) {
        // TODO 对新开户的用户进行保存
        for(int i = 0; i < ps.length; i++){
            if(ps[i] == null){
                ps[i] = per;
                return true;
            }
        }
        return false;
    }

    /*
     * 验证用户登录
     */
    public Person vaildatePerson(String name, String pwd) {
        // TODO 验证用户登录
        for(int i = 0; i < ps.length; i++){
            if(ps[i] != null && name.equals(ps[i].getName()) && pwd.equals(ps[i].getPwd())){
                return ps[i];
            }
        }
        return null;
    }

    /**
     * 获取所有用户
     * @return 所有用户
     */
    public Person[] getAllUsers() {
        // TODO 返回所有用户
        return ps;
    }


}
