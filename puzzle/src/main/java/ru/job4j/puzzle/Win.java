package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
       boolean gameResult = Logic.wasWin(board);
       boolean rsl = false;
        if (gameResult) {
            rsl = true;
            return rsl;
        }
        return rsl;
    }
}
