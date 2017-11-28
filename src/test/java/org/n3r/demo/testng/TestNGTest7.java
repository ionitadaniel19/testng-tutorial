package org.n3r.demo.testng;

import org.testng.annotations.*;
import org.testng.Assert; 

/**
 * TestNG Dependency Test
 * @author mkyong
 *
 */
public class TestNGTest7 {

    @Test (dependsOnMethods={"method2"})
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test
    public void method2() {
        System.out.println("This is method 2");
        Assert.assertEquals(1,2); 
    }


}
