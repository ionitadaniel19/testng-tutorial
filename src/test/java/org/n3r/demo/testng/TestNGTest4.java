package org.n3r.demo.testng;

import org.testng.annotations.*;

/**
 * TestNG TimeOut Test
 * @author mkyong
 *
 */
public class TestNGTest4 {

    @Test(timeOut = 1000, enabled = false)
    public void infinity() {
        while (true);
    }

}