package org.psjava.algo.sequence.search;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.algo.sequence.search.BinarySearchLast;
import org.psjava.ds.math.Function;
import org.psjava.ds.numbersystrem.IntegerNumberSystem;
import org.psjava.util.DefaultComparator;

public class BinarySearchLastTest {

    private static final IntegerNumberSystem NS = IntegerNumberSystem.getInstance();
    private static final DefaultComparator<Integer> COMP = new DefaultComparator<Integer>();

    @Test
    public void test() {
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer get(Integer input) {
                return input / 2;
            }
        };
        Assert.assertEquals(3, (int) BinarySearchLast.search(NS, f, COMP, 0, 10, 1, -1));
        Assert.assertEquals(-1, (int) BinarySearchLast.search(NS, f, COMP, 0, 10, 99, -1));
    }

}
