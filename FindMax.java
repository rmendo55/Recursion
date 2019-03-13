package Recursion;

public class FindMax {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 7, 45, 33, 27};
        System.out.println(findMax(arr, 0, 0));
    }


    //recursive method that finds the maximum element in an integer array
    public static int findMax(int[] arr, int max, int n) {
        //base case
        if (n == arr.length) {
            return max;
        }
        else {
            if (arr[n] > max) {
                max = arr[n];
            }
        }

        return findMax(arr, max, n + 1);
    }


}
