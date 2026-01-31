package org.example.algorithms.hw_l01_cycles_and_recursion;

import static java.lang.System.lineSeparator;

public class Square11 {

    public static void main(String[] args) {
        int n = 25;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                var xCondition = x == 1 || x == 23;
                var yCondition = y == 1 || y == 23;
                var result = xCondition || yCondition ? "#" : ".";
                System.out.print(result);
            }
            System.out.print(lineSeparator());
        }
    }
}
