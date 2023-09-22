package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 5}, {7, 8, 9}, {4, 6, 2, 1}};
        for (int[] i : numbers) {
            System.out.println("Размер вложенного массива равен: " + i.length);
        }
    }
}