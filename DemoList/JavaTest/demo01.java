package JavaTest;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Demo 01.
 */
public class demo01 {
    /**
     * The entry point of application.
     *
     * @param a the input arguments
     */
    public static void main(String[] a) {
        List strList = new ArrayList<>();

        //������
        strList.add(0, "0");
        System.out.println(strList);

        //��ָ�������������
        strList.add(1, "1");
        System.out.println(strList);
        //����
        strList.set(1, "2");
        //ȥ��
        strList.remove("1");
        for (Object i : strList) {
            System.out.println(i);
        }
    }
}
