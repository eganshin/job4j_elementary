package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int index = 0; index <= n; index++) {
            if (index == 0 || index == 1) {
                result = 1;
            } else {
                result *= index;
            }
        }
        return result;
    }
}
