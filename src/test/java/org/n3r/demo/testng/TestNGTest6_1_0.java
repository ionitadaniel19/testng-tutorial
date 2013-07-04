package org.n3r.demo.testng;

import org.testng.annotations.*;

/**
 * TestNG Parameterized Test
 * @author mkyong
 *
 */
public class TestNGTest6_1_0 {

    // java org.testng.TestNG testng1.xml [testng2.xml testng3.xml ...]
    @Test
    @Parameters("number")
    public void parameterIntTest(int number) {
        System.out.println("Parameterized Number is : " + number);
    }
}