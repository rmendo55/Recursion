package Nqueen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NqueenSolution solution = new NqueenSolution();
        int[][] board = new int[4][4];
        nQueens(board, solution, 0);
        solution.printSolutions();
    }

    public static void nQueens(int[][] board, NqueenSolution solution, int row) {
       //base case
       if (row == board.length) {
           //a solution exists, add it to NqueenSolution class
           solution.addSolution(board);
           return;
       }
       else {
           for (int i = 0; i < board[0].length; i++) {
               //place queen at current row and column: i but first validate
               if (!(validation_position(board, row, i))) {
                   //place queen and then recurse
                   board[row][i] = 1;
                   nQueens(board, solution, row + 1);
                   //when recursed back set current row and col back to 0
                   board[row][i] = 0;
               }
           }

           return;
       }
    }

    public static boolean validation_position(int[][] arr, int row, int col) {
        //check left to right
        boolean not_collision = false;
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[row][i] == 1) {
                not_collision = true;
                break;
            }
        }

        //check right diagonal
        int r = row;
        int c = col;
        while (r >= 0 && c < arr[0].length) {
            if (arr[r][c] == 1) {
                not_collision = true;
                break;
            }
            r = r - 1;
            c = c + 1;
        }
        //check left diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 1) {
                not_collision = true;
                break;
            }
            r = r - 1;
            c = c - 1;
        }
        //check lower right diagonal
        r = row;
        c = col;
        while (r < arr.length && c < arr[0].length) {
            if (arr[r][c] == 1) {
                not_collision = true;
                break;
            }
            r = r + 1;
            c = c + 1;
        }
        //check lower left diagonal
        r = row;
        c = col;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == 1) {
                not_collision = true;
                break;
            }
            r = r + 1;
            c = c - 1;
        }
        //check top to bottom
        r = row;
        c = col;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == 1) {
                not_collision = true;
                break;
            }
        }
        return not_collision;
    }
}
