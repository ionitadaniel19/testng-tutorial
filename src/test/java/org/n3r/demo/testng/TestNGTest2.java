package org.n3r.demo.testng;

import org.testng.annotations.*;

/**
 * TestNG Expected Exception Test
 * @author mkyong
 *
 */
public class TestNGTest2 {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }

}