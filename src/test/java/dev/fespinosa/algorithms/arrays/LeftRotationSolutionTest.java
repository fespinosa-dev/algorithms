package dev.fespinosa.algorithms.arrays;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;


public class LeftRotationSolutionTest {


    @Test
    public void testRotLeft() {
        LeftRotationSolution solution = new LeftRotationSolution();
        int[] result =  solution.rotLeft(Array.of(5), 2);
        assertThat(result, is(new int[]{3,4,5,1,2}));
    }
    
}