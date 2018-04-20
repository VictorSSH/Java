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

        //最后添加
        strList.add(0, "0");
        System.out.println(strList);

        //在指定的索引处添加
        strList.add(1, "1");
        System.out.println(strList);
        //更换
        strList.set(1, "2");
        //去掉
        strList.remove("1");
        for (Object i : strList) {
            System.out.println(i);
        }
    }
}
