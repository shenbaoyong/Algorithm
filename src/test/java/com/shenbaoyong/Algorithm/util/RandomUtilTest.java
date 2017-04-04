package com.shenbaoyong.algorithm.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class RandomUtilTest {
    @Test
    public void test()throws Exception{
        int [] a = RandomUtil.generatedigit();
        Assert.assertEquals(100, a.length);
        for (int i : a) {
            Assert.assertTrue(i >= -1000 && i < 1000);
        }

        a = RandomUtil.generatedigit(20);
        Assert.assertEquals(20, a.length);
        for (int i : a) {
            Assert.assertTrue(i >= -1000 && i < 1000);
        }


        a = RandomUtil.generatedigit(20, -5, 5);
        Assert.assertEquals(20, a.length);
        for (int i : a) {
            Assert.assertTrue(i >= -5 && i < 5);
        }
    }
}
