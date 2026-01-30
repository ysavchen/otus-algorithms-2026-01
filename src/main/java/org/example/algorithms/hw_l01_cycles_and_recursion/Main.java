package org.example.algorithms.hw_l01_cycles_and_recursion;

public class Main {

    public static void main(String[] args) {
        int n = 25;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                var result = x > y ? "#" : ".";
                System.out.print(result);
            }
            System.out.print("\n");
        }
    }
}
