package JavaTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class demo02Test extends demo02 {
    demo02 d = new demo02();
    int sum = d.sum(1,1);
    int testsum=3;

    @Test
    public void sum() {
        System.out.println("@Test sum():"+sum+"="+testsum);
        assertEquals(sum,testsum);
    }
}