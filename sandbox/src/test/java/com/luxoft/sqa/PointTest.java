package com.luxoft.sqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistanceRandom(){
        Point p1 = new Point (3.125,5.5);
        Point p2 = new Point(6.125,1);
        Assert.assertEquals(p1.distance(p2), 5.408326913195984);
    }

    @Test
    public void testDistanceEquals() {
        Point p1 = new Point(5, 1);
        Point p2 = new Point(5, 1);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }
}
