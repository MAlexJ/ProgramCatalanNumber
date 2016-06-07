package com.malex.service;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by malex on 07.06.16.
 *
 *  The Catalan numbers satisfy the recurrence relation:
 *  Cn = C0Cn - 1 + C1Cn - 2 + C2Cn - 3 +...+ Cn - 2C1 + Cn - 1C0.
 */
public class CatalanNumbersTest {

    private int[] numbers;

    @Before
    public void init() {
        /**
         *  https://en.wikipedia.org/wiki/Catalan_number
         *
         *   n   	0 	1 	2 	3 	4 	5 	6 	     7 	     8 	    9 	     10
         *   Cn 	1 	1 	2 	5 	14 	42 	132 	429 	1430 	4862 	16796
         */
        this.numbers = new int[]{1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796};
    }

    @Test
    public void calculateNull() {
        //given
        CatalanNumbers catalan = new CatalanNumbers();
        catalan.setCount(0);

        //when
        int actualNumber = catalan.calculate();

        //then
        assertEquals(1, actualNumber);
    }

    @Test
    public void calculate_01() {
        //given
        CatalanNumbers catalan = new CatalanNumbers();
        catalan.setCount(2);

        //when
        int actualNumber = catalan.calculate();

        //then
        assertEquals(2, actualNumber);
    }


    @Test
    public void calculate_02() {
        //given
        CatalanNumbers catalan = new CatalanNumbers();

        //when
        for (int i = 0; i < this.numbers.length; i++) {
            catalan.setCount(i);
            int actualNumber = catalan.calculate();
            int expectNumber = this.numbers[i];
            assertEquals(expectNumber, actualNumber);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateException() {
        //given
        CatalanNumbers catalan = new CatalanNumbers();
        catalan.setCount(-1);

        //when
        int actualNumber = catalan.calculate();

        //then
        assertEquals(2, actualNumber);
    }


}
