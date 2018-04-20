package JavaException;
/**
 * 功能描述: <br>
 * 〈p〉指定多个泛型类型
 *
 * @return:泛型;
 * @since: 1.0.0
 * @Date: 2018/4/11 11:09
 */
class Notepad<K,V>{
    private  K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class Demo02 {
    public static void main(String[] a){
        Notepad<String,Integer> n = new Notepad<String, Integer>();
        n.setKey("叔本华");
        n.setValue(30);
        System.out.println("name:"+n.getKey()+"年代:"+n.getValue());
    }
}
