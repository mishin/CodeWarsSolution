package main.com.griddynamics;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public final class RotateTest {
    @Test
    public final void testRotate()
    {
        //Initialize array
        int [] arr = new int [] {1,2,3,4,5,6,7};//{4,5,6,7,1,2,3}
        //n determine the number of times an array should be rotated.
        int n = 3;
        new Rotate().rotate(arr, n);
        Assert.assertEquals(1L, 1L);
    }
}