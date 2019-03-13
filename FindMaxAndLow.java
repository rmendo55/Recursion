package Recursion;

public class FindMaxAndLow {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 7, 45, 100, 27};
        System.out.println("Greatest Integer: " + findMax(arr, arr[0], 0));
        System.out.println("Lowest Integer: " + findLow(arr, arr[0], 0));
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

    //recursive method that finds the lowest element in an integer array
    public static int findLow(int[] arr, int low, int n) {
        //base case
        if (n == arr.length) {
            return low;
        }
        else {
            if (arr[n] < low) {
                low = arr[n];
            }
        }

        return findLow(arr, low, n + 1);
    }


}
