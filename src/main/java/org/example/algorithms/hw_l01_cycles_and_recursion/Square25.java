package org.example.algorithms.hw_l01_cycles_and_recursion;

import static java.lang.System.lineSeparator;

public class Square25 {

    public static void main(String[] args) {
        int n = 25;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                var xCondition = x == 0 || x == 6 || x == 12 || x == 18 || x == 24;
                var yCondition = y == 0 || y == 6 || y == 12 || y == 18 || y == 24;
                var result = xCondition || yCondition ? "#" : ".";
                System.out.print(result);
            }
            System.out.print(lineSeparator());
        }
    }
}
