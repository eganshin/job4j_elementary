package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int pointOne = 0;
        int pointTwo = array.length - 1;

        while (pointOne < pointTwo) {
            int sum = array[pointOne] + array[pointTwo];
            if (sum == target) {
                return new int[]{pointOne, pointTwo};
            } else if (sum < target) {
                pointOne++;
            } else {
                pointTwo--;
            }
        }
        return new int[0];
    }
}