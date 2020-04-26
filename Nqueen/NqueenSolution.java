package Nqueen;

import java.util.ArrayList;

public class NqueenSolution {
    private ArrayList<int[][]> solution;

    public NqueenSolution() {
        this.solution = new ArrayList<int[][]>();
    }

    public void addSolution(int[][] arr) {
        //make a deep copy
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        solution.add(newArr);
    }

    public void printSolutions() {
        for (int i = 0; i < solution.size(); i++) {
            System.out.print("Solution #: " + (i + 1));
            System.out.println();
            for (int j = 0; j < solution.get(0).length; j++) {
                for (int k = 0; k < solution.get(0)[0].length; k++) {
                    System.out.print(this.solution.get(i)[j][k]);
                }
                System.out.println();
            }
        }

    }

    public ArrayList<int[][]> getList() {
        return this.solution;
    }

}
