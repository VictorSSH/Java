package com.journaldev.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class ExceptionHandling {
    /**
     * @param a
     * @throws Exception
     */
    public static void main(String[] a) throws Exception {
        try {
            testException(4);
            testException(-3);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Releasing resources");
        }
        testException(15);

    }

    public static void testException(int i) throws FileNotFoundException, IOException {
        if (i < 0) {
            FileNotFoundException MyException = new FileNotFoundException("Negative Integer" + i);
            throw MyException;
        } else if (i > 0) {
            throw new IOException("Only supported for index 0 to 10");
        }
    }
}
