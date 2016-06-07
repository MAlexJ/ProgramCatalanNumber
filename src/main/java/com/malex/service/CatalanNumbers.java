package com.malex.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malex on 07.06.16.
 *
 * This class calculate the Catalan numbers.
 *
 * In combinatorial mathematics, the Catalan numbers form a sequence
 * of natural numbers that occur in various counting problems,
 * often involving recursively-defined objects.
 *
 */
public class CatalanNumbers {

    private List<Integer> list;
    private int count;


    public CatalanNumbers() {
    }

    public void setCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("You entered an incorrect value.");
        }
        this.count = count;
    }

    public int calculate() {
        this.list = new ArrayList<>();
        // if  count == 0 valid braces sequence only one -> 1
        if (count == 0) {
            return 1;
        } else {
            list.add(1);
        }

        int countSequences;

        // if count >= 1
        for (int i = 1; i <= count; ++i) {
            countSequences = 0;
            for (int j = 0; j < i; ++j) {
                countSequences += list.get(j) * list.get(i - 1 - j);
            }
            list.add(countSequences);
        }
        return list.get(count);
    }
}
