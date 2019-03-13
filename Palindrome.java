package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(helperMethod("anna"));
    }

    public static boolean helperMethod(String s) {
       return isPalindrome(s, "", s.length() - 1);
    }
    public static boolean isPalindrome(String s, String s2, int position) {
        //base case
        if (s2.length() == s.length()) {
            return s2.equalsIgnoreCase(s);
        }
        else {
            s2 += s.charAt(position);
            return isPalindrome(s, s2, position - 1);
        }
    }
}
