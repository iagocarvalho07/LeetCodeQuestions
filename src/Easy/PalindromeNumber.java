package Easy;

//Given an integer x, return true if x is a
//palindrome
//, and false otherwise.
//
//
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
//

//https://leetcode.com/problems/palindrome-number/description/

public  class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String X = String.valueOf(x);
        int n = X.length();
        StringBuilder sb = new StringBuilder(X);
        System.out.println(sb.reverse().toString().equals(X));
        return sb.reverse().toString().equals(X);
    }

    public void main(String[] args) {
        this.isPalindrome(1);
    }
}

//public static void main(String[] args) {
//    PalindromeNumber palindromeNumber = new PalindromeNumber();
//    palindromeNumber.isPalindrome(121);
//}
