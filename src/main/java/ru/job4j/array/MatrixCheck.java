package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (char cell : board[row]) {
            if (cell != 'X') {
                return false;
            }
        }
        return true;
    }
}