package com.luxoft.sqa;

import com.luxoft.sqa.QuadraticEquation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RootTest {
    @Test
    public void testRootCount0(){
        QuadraticEquation eq = new QuadraticEquation(7, 1, 1);
        Assert.assertEquals(eq.RootCount(), 0);
    }
    @Test
    public void testRootCount1(){
        QuadraticEquation eq = new QuadraticEquation(1, 2, 1);
        Assert.assertEquals(eq.RootCount(), 1);
    }

    @Test
    public void testRootCount2(){
        QuadraticEquation eq = new QuadraticEquation(7, 8, 1.5);
        Assert.assertEquals(eq.RootCount(), 2);
    }
}
