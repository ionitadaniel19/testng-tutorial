package org.n3r.demo.testng;

import org.testng.annotations.*;

/**
 * TestNG Ignore Test
 * @author mkyong
 *
 */
public class TestNGTest3 {

    @Test(enabled=false)
    public void divisionWithException() {
        System.out.println("Method is not ready yet");
    }

}
