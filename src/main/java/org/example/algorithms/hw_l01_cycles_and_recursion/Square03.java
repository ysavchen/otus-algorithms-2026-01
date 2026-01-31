package org.example.algorithms.hw_l01_cycles_and_recursion;

import static java.lang.System.lineSeparator;

public class Square03 {

    public static void main(String[] args) {
        int n = 25;
        int cell = 24;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                var result = x == cell ? "#" : ".";
                System.out.print(result);
            }
            --cell;
            System.out.print(lineSeparator());
        }
    }
}
